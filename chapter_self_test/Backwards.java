package chapter_self_test;


class Backwards {
    String str = "Hello Recursion";

    public static void main(String[] args) {
        Backwards one = new Backwards();

        one.backwardsIndex(0);
        //System.out.println(ch);
    }

    void backwardsIndex(int i) {

        if (i == str.length()) {
            return;
        }
        backwardsIndex(i + 1);
        System.out.println(str.charAt(i));
    }
}
