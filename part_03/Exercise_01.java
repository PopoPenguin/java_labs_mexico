package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Exercise_01 {
    public static void main(String[] args) {


        Box one = new Box(7, 9, 15);

        Cat orangeCat = new Cat("orange","fat","Garfield");


        int surfaceOne= one.surfaceArea();
        int volumeOne = one.volume();


        System.out.println("My name is " + orangeCat.name);
        System.out.println("I am " + orangeCat.size);
        System.out.println("My color is " + orangeCat.color + " " + orangeCat.like()) ;

        System.out.println("Box one has volume " + volumeOne + " and surface area of " + surfaceOne);

    }
}




class Cat{

    String color;
    String size;
    String name;


    public Cat (String color, String size, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }

    public String like(){

        return "I like boxes";
    }
}



class  Box {
    int height;
    int width;
    int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // returns surface area of box
    int surfaceArea() {

        return (2 * height * width) + (2 * height * length) + (2 * length * width);
    }

    //returns volume of box
    int volume() {

        return (height * width * length);
    }
}