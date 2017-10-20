package chapter_self_test.candy_factory.model.candycane;

/*
created by PopoPenguin on 10/19/17
*/


import chapter_self_test.candy_factory.candy_interface.CandyCaneInterface;

public class OrangeTang implements CandyCaneInterface {



    private String name = "Bubble Gum";

    private int amount = 12;

    public OrangeTang(String name, int amount) {
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
