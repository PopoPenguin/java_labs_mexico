package chapter_self_test.candy_factory.model.chocolate;

/*
created by PopoPenguin on 10/19/17
*/


import chapter_self_test.candy_factory.candy_interface.ChocolateInterface;

public class Hersheys implements ChocolateInterface {

    String name = "Hersheys";
    int amount = 12;

    public Hersheys(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

}
