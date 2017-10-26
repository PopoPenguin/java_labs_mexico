package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */


public class ArraySwitchPos {
    public static void main(String[] args) {
        ArraySwitchPos one = new ArraySwitchPos();
        PrintArray two = new PrintArray();

        Integer [] x = {1,2,3,4,5,6,7,8};
        two.printArray(x);
        System.out.println("Before position change");
        one.switchArrayPos(x,4,7);
        two.printArray(x);
        System.out.println("After position change");

    }

    public <T> T[] switchArrayPos(T [] x, int pos1, int pos2){

        T temp =  x[pos1];
        x [pos1] = x[pos2];
        x [pos2] = temp;

        return x;
    }



}
