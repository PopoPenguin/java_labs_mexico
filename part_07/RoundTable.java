package part_07;

class RoundTable extends Table{

    //private variables
    private double diameter;


    //constructor for RoundTable


    public RoundTable(String name, double length, double width, double height, double tableLength,
                      double tableWidth, double diameter) {
        super(name, length, width, height, tableLength, tableWidth);
        this.diameter = diameter;
    }

    public RoundTable(String name, String material, int numOfFurniture, String type, int numOfLegs,
                      String color, double length, double width, double height, double tableLength,
                      double tableWidth, double diameter) {
        super(name, material, numOfFurniture, type, numOfLegs, color, length, width, height, tableLength, tableWidth);
        this.diameter = diameter;
    }

    //methods for RoundTable

    // override method specific to table surface area for circular tables
    @Override
    double tableSurfArea() {
        return Math.PI * Math.pow(diameter/2, 2);
    }

    // override method specific to volume of a cylindrical object
    @Override
    public double volumeTotal() {
        return Math.PI * Math.pow(diameter/2, 2) * super.getHeight();
    }

    // method override to include new variable descriptions
    @Override
    public void description() {
        super.description();
        System.out.println("Diameter: " + diameter);
    }


    //getters setters

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
