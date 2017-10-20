package chapter_self_test.candy_factory.model.chocolate;

/*
created by PopoPenguin on 10/19/17
*/


import chapter_self_test.candy_factory.candy_interface.ChocolateInterface;

public class RabbitEgg implements ChocolateInterface {


    String name = "RabbitEgg";
    int amount = 13;

    public RabbitEgg(String name, int amount) {
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
