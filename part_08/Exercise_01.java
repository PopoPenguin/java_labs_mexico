package part_08;

public class Exercise_01 {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            if (x/y!=0){
                x = y;
            }
        }catch (ArithmeticException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
