package chapter_self_test.iopractice;

/*
created by PopoPenguin on 10/19/17
*/


public class Airline {

    private String airline;
    private int incidents_85_99;
    private int fatal_accidents_85_99;
    private int fatalities_85_99;
    private int incidents_00_14;
    private int fatal_accidents_00_14;
    private int fatalities_00_14;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getIncidents_85_99() {
        return incidents_85_99;
    }

    public void setIncidents_85_99(int incidents_85_99) {
        this.incidents_85_99 = incidents_85_99;
    }

    public int getFatal_accidents_85_99() {
        return fatal_accidents_85_99;
    }

    public void setFatal_accidents_85_99(int fatal_accidents_85_99) {
        this.fatal_accidents_85_99 = fatal_accidents_85_99;
    }

    public int getFatalities_85_99() {
        return fatalities_85_99;
    }

    public void setFatalities_85_99(int fatalities_85_99) {
        this.fatalities_85_99 = fatalities_85_99;
    }

    public int getIncidents_00_14() {
        return incidents_00_14;
    }

    public void setIncidents_00_14(int incidents_00_14) {
        this.incidents_00_14 = incidents_00_14;
    }

    public int getFatal_accidents_00_14() {
        return fatal_accidents_00_14;
    }

    public void setFatal_accidents_00_14(int fatal_accidents_00_14) {
        this.fatal_accidents_00_14 = fatal_accidents_00_14;
    }

    public int getFatalities_00_14() {
        return fatalities_00_14;
    }

    public void setFatalities_00_14(int fatalities_00_14) {
        this.fatalities_00_14 = fatalities_00_14;
    }

    public void compile (){
        System.out.println(airline + " " + incidents_85_99 + " " + fatal_accidents_85_99 + " "
                + fatalities_85_99 + " " + incidents_00_14 + " " + fatal_accidents_00_14 + " " + fatalities_00_14);
    }
}
