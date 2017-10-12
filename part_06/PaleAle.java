package part_06;

class PaleAle extends Ale {
    private String style;


    //overloading constructor
    public PaleAle() {
    }

    public PaleAle(String name) {
        super(name);    //setting name
    }

    public PaleAle(String name, String style) {
        super(name);
        this.style = style;
    }

    public PaleAle(String name, int numDrinks, int tempBrew, String style) {
        super(name, numDrinks, tempBrew);
        this.style = style;
    }

    public PaleAle(String name, int tempBrew, String style) {
        super(name, tempBrew);
        this.style = style;
    }

    //getter and setter


    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    static void setClar (String clarity){
        Beer one = new Beer();
        one.setClarity(clarity);
    }

    @Override
    public void setFlavor(String flavor) {
        super.setFlavor(flavor);
    }

    //methods for PaleAle

    //methods for Beer
    @Override
    String getHappy (Beer ob){
        if (numDrinks>=15){
            return "I am drunk.";
        } else
            return "I have yet peed myself.";
    }



}

