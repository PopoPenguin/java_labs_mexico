package part_07;

public class FurnitureController {


    // declaration of objects and implementation of methods of super and subclass
    public static void main(String[] args) {
        Furniture test = new Furniture("bench",3,4,5);
        test.description();
        System.out.println();

        Table testTable = new Table("Table",10,13,7,10,13);
        testTable.description();
        System.out.println();

        Table diningTable = new Table ("Dining Table","wood", 1, "indoor",4, "beige", 15,10,8,15,10);
        diningTable.description();
        System.out.println();

        RoundTable nightStand = new RoundTable("Night Stand","wood",2,"indoor", 5,"beige", 2,2,2,0,0,7);
        nightStand.description();
        System.out.println();

        Chair diningChair = new Chair("Dining Chair","wood",4,"indoor",4,"Beige",4,5,8,2,3,4,3,0,"plush","no");
        diningChair.description();
        System.out.println();

        String matchColor = diningTable.colorMatch(diningChair,diningTable);
        System.out.println(matchColor);

        String matchType = nightStand.furnitureMatch(nightStand, diningTable);
        System.out.println(matchType);


    }
}
