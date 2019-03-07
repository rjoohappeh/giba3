package com.capstone.giba;

public class Events
{
    private Host host;
    private String address;
    private String eventCity;
    private Volunteer [] volunteerArray;

    // Default Constructor
    public Events() {
    }

    // Overloaded Constructor
    public Events(Host host, String address, String eventCity,
                  Volunteer [] volunteerArray) {
        this.host = host;
        this.address = address;
        this.eventCity = eventCity;
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

    // Getter for @address
    public String getAddress() {
        return address;
    }

    // Setter for @address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for @eventCity
    public String getEventCity() {
        return eventCity;
    }

    // Setter for @eventCity
    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }
}
