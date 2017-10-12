package part_06;

class Ale extends Beer {
    //brewed using warm fermentation
    final static String typeOfYeast = "Top Fermenting";
    private int tempBrew;

    //overloading constructors


    public Ale() {
    }

    public Ale(String name) {
        super(name);        //setting name
    }

    public Ale(String name, int numDrinks, int tempBrew) {
        super(name, numDrinks);
        this.tempBrew = tempBrew;
    }

    public Ale(String name, int tempBrew) {
        super(name);
        this.tempBrew = tempBrew;

    }


    //getter and setter
    @Override
    public void setClarity(String clarity) {
        super.setClarity(clarity);
    }

    @Override
    public String getClarity() {
        return super.getClarity();
    }

    public int getTempBrew() {
        return tempBrew;
    }

    public void setTempBrew(int tempBrew) {
        this.tempBrew = tempBrew;
    }

    //methods for Ale
    boolean isAle(Ale ob) {

        int temp = ob.tempBrew;

        if (temp >= 60 && temp <= 75) {
            return true;
        } else
            return false;
    }

    //methods for Beer

    @Override
    String getHappy (Beer ob){
        if (numDrinks>=7){
            return "I am on my way to happiness.";
        } else
            return "I am peeing a lot.";
    }

}

