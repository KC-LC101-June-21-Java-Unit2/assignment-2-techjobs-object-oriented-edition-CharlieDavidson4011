package org.launchcode.techjobs.oo.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

public class JobTest {

    static Job testJobObject1;
    static Job testJobObject2;
    static Job testJobObject3;
    static Job testJobObject4;
    static Job testJobObject5;
    static Job testJobObject6;
    static Job testJobObject7;

    @BeforeClass
    public static void createJobObjects() {
        testJobObject1 = new Job();
        testJobObject2 = new Job();
        testJobObject3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        testJobObject4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        testJobObject5 = new Job("Product tester",
                new Employer(),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency());
        testJobObject6 = new Job("",
                new Employer("ACME"),
                new Location(),
                new PositionType(),
                new CoreCompetency("Persistence"));

        testJobObject7 = new Job("",
                new Employer(""),
                new Location(),
                new PositionType(),
                new CoreCompetency(""));
    }
        @Test
        public void testSettingJobId() {
    assertEquals(1, testJobObject1.getId());
    assertEquals(2, testJobObject2.getId());
    assertFalse(testJobObject1.getId() == testJobObject2.getId());
    assertTrue(testJobObject1.getId() < testJobObject2.getId());
    assertEquals(1, testJobObject2.getId() - testJobObject1.getId());
}
@Test
        public void testJobConstructorSetsAllFields() {
        assertTrue(testJobObject3.getName() instanceof String);
        assertEquals("Product tester", testJobObject3.getName());
        assertTrue(testJobObject3.getEmployer() instanceof Employer);
        assertEquals("ACME", testJobObject3.getEmployer().getValue());
        assertTrue(testJobObject3.getLocation() instanceof Location);
        assertEquals("Desert", testJobObject3.getLocation().getValue());
        assertTrue(testJobObject3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJobObject3.getPositionType().getValue());
        assertTrue(testJobObject3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJobObject3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        assertEquals(false, testJobObject3 == testJobObject4);
    }
    @Test
    public void testForLeadBlankLine() {     // Check for /n
        assertTrue(testJobObject1.toString().startsWith("\n")); //(testJobObject3)

    }

    @Test
    public void testForTrailBlankLine() {     // Check for /n
        assertTrue(testJobObject1.toString().endsWith("\n")); //(testJobObject3)
    }

    @Test
    public void testForLabelsWithDataOnNewLines() {

        String expected = "\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";
        assertEquals(expected, testJobObject3.toString());
    }
    @Test
    public void testForSomeNullFields() {

        String expected = "\n" +
                "ID: 5\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n";                        // put the expected value here
        assertEquals(expected, testJobObject5.toString());

    }

    @Test
    public void testForSomeNullFields2() {

        String expected = "\n" +
                "ID: 6\n" +
                "Name: Data not available\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Persistence\n";
        assertEquals(expected, testJobObject6.toString());
    }

    @Test
    public void testForAllNullFields() {

        String expected = "\nOOPS! This job does not seem to exist.\n";
        assertEquals(expected, testJobObject1.toString());
    }

    @Test
    public void testForAllNullFields2() {

        String expected = "\nOOPS! This job does not seem to exist.\n";
        assertEquals(expected, testJobObject7.toString());

    }
}

