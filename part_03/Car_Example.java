package part_03;

/*
This is an example for using getters and setters.
 */

class BankBalance {

    int balance ;
    int credit_balance ;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class CarController {
    public static void main(String[] args) {

        BankBalance ryanBalance = new BankBalance ();
        ryanBalance.balance = 0;                    //these are public and anyone can modify
        ryanBalance.credit_balance = 10000000;

//        ryanBalance.age = 45              //this line does not execute because it is private and cannot be modified
        ryanBalance.setAge(51);             //can set age for a private variable this way

        System.out.println(ryanBalance.getAge() + "  is Ryan's age");


    }

}
