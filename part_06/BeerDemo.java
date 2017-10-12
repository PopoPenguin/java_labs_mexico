package part_06;


public class BeerDemo {
    public static void main(String[] args) {

        PaleAle pa = new PaleAle("IPA", 15, 66,"West Coast");
        pa.setClarity("Clear");

        Beer coors = new Beer("coors", 1); //constructor overloading
        coors.describeMyself(coors);
        System.out.println(coors.getHappy(coors));  //method overriding getHappy

        System.out.println();
        Beer budLight = new Beer ("budLight",4, "barley");  //constructor overloading
        budLight.describeMyself(budLight);
        System.out.println(budLight.getHappy(budLight));


        System.out.println();
        Ale newAle = new Ale("Brown Ale",10, 85);
        newAle.describeMyself(newAle);
        System.out.println(newAle.getHappy(newAle)); //method overriding / dynamic method getHappy

        System.out.println();
        System.out.println("Beer brewed at  " + pa.getTempBrew() + " F");
        System.out.println("This beer is an ale = " + pa.isAle(pa));
        pa.describeMyself(pa);
        System.out.println(pa.getHappy(pa)); //method overriding / dynamic method getHappy


    }
}
