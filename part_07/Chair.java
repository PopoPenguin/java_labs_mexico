package part_07;

class Chair extends Furniture {

    //private variables
    private double backHeight;
    private double backWidth;
    private double seatWidth;
    private double seatLength;
    private int numOfArms;
    private String cushion;
    private String recline;


    //constructor for chair


    public Chair(String name, double length, double width, double height, double backHeight, double backWidth,
                 double seatWidth, double seatLength, int numOfArms, String cushion, String recline) {
        super(name, length, width, height);
        this.backHeight = backHeight;
        this.backWidth = backWidth;
        this.seatWidth = seatWidth;
        this.seatLength = seatLength;
        this.numOfArms = numOfArms;
        this.cushion = cushion;
        this.recline = recline;
    }

    public Chair(String name, String material, int numOfFurniture, String type, int numOfLegs, String color,
                 double length, double width, double height, double backHeight, double backWidth, double seatWidth,
                 double seatLength, int numOfArms, String cushion, String recline) {
        super(name, material, numOfFurniture, type, numOfLegs, color, length, width, height);
        this.backHeight = backHeight;
        this.backWidth = backWidth;
        this.seatWidth = seatWidth;
        this.seatLength = seatLength;
        this.numOfArms = numOfArms;
        this.cushion = cushion;
        this.recline = recline;
    }

    // methods for chair
    // checks whether chair is reclinable
    boolean doesRecline (String recline){

        switch (recline){
            case "Yes":
                return true;
            case "No":
                return false;
            default:
                return false;
        }
    }

    // method to calculate back rest area
    double backArea (){
        return backHeight * backWidth;
    }
    // method to calculate seat area
    double seatArea (){
        return seatLength * seatWidth;
    }



    // override method for description to include new variables specific to chair
    @Override
    public void description() {
        super.description();
        System.out.println("Back Area: " + backArea());
        System.out.println("Seat Area: " + seatArea());
        System.out.println("Reclinable: " + doesRecline(recline));
        System.out.println("Number of Arms: " + numOfArms);
        System.out.println("Cushion: " + cushion);
        System.out.println("Total volume: " + volumeTotal());

    }


    //getters setters


    public double getBackHeight() {
        return backHeight;
    }

    public void setBackHeight(double backHeight) {
        this.backHeight = backHeight;
    }

    public double getBackWidth() {
        return backWidth;
    }

    public void setBackWidth(double backWidth) {
        this.backWidth = backWidth;
    }

    public double getSeatWidth() {
        return seatWidth;
    }

    public void setSeatWidth(double seatWidth) {
        this.seatWidth = seatWidth;
    }

    public double getSeatLength() {
        return seatLength;
    }

    public void setSeatLength(double seatLength) {
        this.seatLength = seatLength;
    }

    public int getNumOfArms() {
        return numOfArms;
    }

    public void setNumOfArms(int numOfArms) {
        this.numOfArms = numOfArms;
    }

    public String getCushion() {
        return cushion;
    }

    public void setCushion(String cushion) {
        this.cushion = cushion;
    }

    public String getRecline() {
        return recline;
    }

    public void setRecline(String recline) {
        this.recline = recline;
    }
}
