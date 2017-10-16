package part_07;

class Furniture implements FurnitureInterface{

    //variables for furniture
    private String name;
    private String material;
    private int numOfFurniture;
    private String type;
    private int numOfLegs;
    private String color;
    private double length;
    private double width;
    private double height;

    //constructor for Furniture


    public Furniture(String name, double length, double width, double height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Furniture(String name, String material, int numOfFurniture, String type, int numOfLegs,
                     String color, double length, double width, double height) {
        this.name = name;
        this.material = material;
        this.numOfFurniture = numOfFurniture;
        this.type = type;
        this.numOfLegs = numOfLegs;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // methods for furniture
    // calculating overall total volume
    public double volumeTotal (){

        return length * width * height;

    }
    // implementing method from interface to superclass
    @Override
    public String furnitureMatch(Furniture ob1, Furniture ob2) {
        if (ob1.type.equalsIgnoreCase(type)==ob2.type.equalsIgnoreCase(type)){
            return ob1.name + " matches " + type + " type between " + ob2.name;
        } else {
            return "Mismatched type " + "between " + ob1.name + " and " + ob2.name;
        }
    }

    // implementing method from interface to superclass
    @Override
    public String colorMatch(Furniture ob1, Furniture ob2){

        if (ob1.color.equalsIgnoreCase(color)==ob2.color.equalsIgnoreCase(color)){
            return ob1.name + " color matches " + color + " color of " + ob2.name;
        } else {
            return "Mismatched colors" + " between " + ob1.name + " and " + ob2.name;
        }
    }

    // description of listed variables
    public void description (){
        System.out.println("Name : " + name);
        System.out.println("Made of : " + material);
        System.out.println("Number of furniture : " + numOfFurniture);
        System.out.println("Type: " + type);
        System.out.println("Number of legs: " + numOfLegs);
        System.out.println("Color is " + color);
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);

    }


    //getters setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumOfFurniture() {
        return numOfFurniture;
    }

    public void setNumOfFurniture(int numOfFurniture) {
        this.numOfFurniture = numOfFurniture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
