package chapter_self_test.candy_factory.model;

/*
created by PopoPenguin on 10/19/17
*/


import chapter_self_test.candy_factory.candy_factory_interface.CandyBoxInterface;
import chapter_self_test.candy_factory.candy_interface.CandyCaneInterface;
import chapter_self_test.candy_factory.candy_interface.ChocolateInterface;

public class CandyBox implements CandyBoxInterface{

    //this is where i make my types of boxes
    ChocolateInterface choco;
    CandyCaneInterface candy;


    public CandyBox(ChocolateInterface choco, CandyCaneInterface candy) {
        this.choco = choco;
        this.candy = candy;
    }

    @Override
    public void describeCandyCane() {

        System.out.println("Candy cane is " + candy.getName() + " # of " + candy.getAmount());

    }

    @Override
    public void describeChocolate() {

        System.out.println("Chocolate name is " + choco.getName() + " # of " + choco.getAmount());


    }
}


