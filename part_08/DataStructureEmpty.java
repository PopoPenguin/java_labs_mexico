package part_08;

public class DataStructureEmpty extends Exception{      //create a new custom exception class for empty data structure


    public DataStructureEmpty(){                        //empty constructor for class
    }

    public String toString() {                          //method to indicate result of exception

        return "Array Stack is empty!!!";
    }
}
