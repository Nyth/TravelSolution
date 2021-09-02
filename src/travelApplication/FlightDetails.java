package travelApplication;

public class FlightDetails {

    // Data-Fields Declaration
    String flightNo, flightName, depTime, Fare;

    public FlightDetails(String flightNo, String flightName, String depTime, String fare) {
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.depTime = depTime;
        Fare = fare;
    }

    // Get Method for Flight No.
    public String getFlightNo() {
        return flightNo;
    }

    // Get Method for Flight Name
    public String getFlightName() {
        return flightName;
    }

    //Get Method for Departure Time
    public String getDepTime() {
        return depTime;
    }

    // Get Method for Fare
    public String getFare() {
        return Fare;
    }

    // Set Method for Set Flight No.
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    // Set Method Set Flight Name
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    // Set Method for Departure Time
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    //  Set Method for Fare
    public void setFare(String fare) {
        Fare = fare;
    }







}
