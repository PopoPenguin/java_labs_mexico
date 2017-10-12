package part_06;

public class Beer {

    //creating variables of beer
    private String clarity;
    private String flavor;
    private String hops;
    private String malts;
    private String name;
    int numDrinks;

    //overloading constructors
    public Beer() {
    }
    public Beer(String name) {
        this.name = name;
    }

    public Beer(String name, int numDrinks) {
        this.name = name;
        this.numDrinks = numDrinks;
    }

    public Beer(String name, int numDrinks, String hops) {
        this.name = name;
        this.numDrinks = numDrinks;
        this.hops = hops;
    }


    //getters and setters for variables
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getHops() {
        return hops;
    }

    public void setHops(String hops) {
        this.hops = hops;
    }

    public String getMalts() {
        return malts;
    }

    public void setMalts(String malts) {
        this.malts = malts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //methods for Beer
    String getHappy (Beer ob){
        if (numDrinks>=3){
            return "I am going to pee a lot.";
        } else
            return "I need more drinks to be happy.";
    }


    void describeMyself(Beer ob){
        System.out.println("I am drinking " + name);
        System.out.println("I drank " + numDrinks + " beers.");
    }
}



