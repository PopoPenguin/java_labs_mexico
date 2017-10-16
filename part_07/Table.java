package part_07;

class Table extends Furniture{

    //private variables
    private double tableLength;
    private double tableWidth;


    // constructor for Table


    public Table(String name, double length, double width, double height, double tableLength, double tableWidth) {
        super(name, length, width, height);
        this.tableLength = tableLength;
        this.tableWidth = tableWidth;
    }

    public Table(String name, String material, int numOfFurniture, String type, int numOfLegs,
                 String color, double length, double width, double height, double tableLength, double tableWidth) {
        super(name, material, numOfFurniture, type, numOfLegs, color, length, width, height);
        this.tableLength = tableLength;
        this.tableWidth = tableWidth;

    }

    // method specific to table surface area for same length and width
    double tableSurfArea (){
        return tableLength * tableWidth;
    }


    // method override to include new variable descriptions
    @Override
    public void description() {
        super.description();
        System.out.println("Length : " + tableLength);
        System.out.println("Width : " + tableWidth);
        System.out.println("Total volume: " + volumeTotal());
        System.out.println("Surface area : " + tableSurfArea());
    }



    //getters setters

    public double getTableLength() {
        return tableLength;
    }

    public void setTableLength(double tableLength) {
        this.tableLength = tableLength;
    }

    public double getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(double tableWidth) {
        this.tableWidth = tableWidth;
    }

}
