package com.capstone.giba;

public class VolunteerBlacklist {
    private Host host;
    private Volunteer [] volunteerArray;

    // Default Constructor
    public VolunteerBlacklist() {
    }

    // Overloaded Constructor
    public VolunteerBlacklist(Host host, Volunteer [] volunteerArray) {
        this.host = host;
        this.volunteerArray = volunteerArray;
    }

    // Getter for @host
    public Host getHost() {
        return host;
    }

    // Getter for @volunteerArray
    public Volunteer[] getVolunteerArray() {
        return volunteerArray;
    }
}
