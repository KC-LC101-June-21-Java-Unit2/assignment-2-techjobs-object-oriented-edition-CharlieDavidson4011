package org.launchcode.techjobs.oo;

import java.util.Objects;


public class Job extends JobField {

    private int id;
    private static int nextId = 1;


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
        this.name = null;
        this.employer = null;
        this.location = null;
        this.positionType = null;
        this.coreCompetency = null;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
//
        String nameS = "Data not available";
        String employerS = "Data not available";
        String locationS = "Data not available";
        String positionTypeS = "Data not available";
        String coreCompetencyS = "Data not available";


        boolean nullName = (String.valueOf(name) == null || String.valueOf(name) == "null" ||String.valueOf(name) == "");
        boolean nullEmployer = (String.valueOf(employer) == null || String.valueOf(employer) == "null" ||String.valueOf(employer) == "");
//
        boolean nullLocation = (String.valueOf(location) == null || String.valueOf(location) == "null" ||String.valueOf(location) == "");
//
        boolean nullPositionType = (String.valueOf(positionType) == null || String.valueOf(positionType) == "null" ||String.valueOf(positionType) == "");
        boolean nullCoreCompetency = (String.valueOf(coreCompetency) == null || String.valueOf(coreCompetency) == "null" ||String.valueOf(coreCompetency) == "");

//
        boolean nullTest = (nullName && nullEmployer && nullLocation && nullPositionType && nullCoreCompetency);
        String oops = "\nOOPS! This job does not seem to exist.\n";

        if(nullTest) {
            return oops;
        } else {

            if(!nullName){
                nameS = String.valueOf(name);
            }
            if(!nullEmployer){
                employerS = String.valueOf(employer);
            }
            if(!nullLocation){
                locationS = String.valueOf(location);
            }
            if(!nullPositionType){
                positionTypeS = String.valueOf(positionType);
            }
            if(!nullCoreCompetency){
                coreCompetencyS = String.valueOf(coreCompetency);
            }
            return "\n" +
                    "ID: " + id + "\n" +
                    "Name: " + nameS + "\n" +
                    "Employer: " + employerS + "\n" +
                    "Location: " + locationS + "\n" +
                    "Position Type: " + positionTypeS + "\n" +
                    "Core Competency: " + coreCompetencyS + "\n";
        }
    }
}
