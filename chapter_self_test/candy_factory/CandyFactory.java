package chapter_self_test.candy_factory;

/*
created by PopoPenguin on 10/19/17
*/


import chapter_self_test.candy_factory.model.CandyBox;
import chapter_self_test.candy_factory.model.candycane.BubbleGum;
import chapter_self_test.candy_factory.model.candycane.OrangeTang;
import chapter_self_test.candy_factory.model.chocolate.Grasshopper;
import chapter_self_test.candy_factory.model.chocolate.RabbitEgg;

public class CandyFactory {

    public static void main(String[] args) {
        //this is where i make my boxes of candy
        BubbleGum wrigley = new BubbleGum("Wrigley", 10);
        OrangeTang wild = new OrangeTang("Wild Tang" , 6);
        Grasshopper tangyChocolate = new Grasshopper("Tangy Hopper", 8);
        RabbitEgg chocobunny = new RabbitEgg("Choco Bunny",1);


        CandyBox superBox = new CandyBox(tangyChocolate,wrigley);
        CandyBox megaBox = new CandyBox(chocobunny,wild);

        System.out.println("Super Box contains: ");
        superBox.describeCandyCane();
        superBox.describeChocolate();

        System.out.println();
        System.out.println("Mega Box contains: " );
        megaBox.describeCandyCane();
        megaBox.describeChocolate();

    }

}
