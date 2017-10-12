package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09{

    public static void main(String[] args) {

        combine("When", " ",  "you", " ",  "are" , " ", "happy", " ","and" ," " , "you"," ", "know"," ","it");

        combine("Clap your hand ");

        combine("Do the hokey poke", " ", "And turn yourself around"," ... ", "That's what its all about!!");

    }


    static void combine (String...var){
        StringBuilder s = new StringBuilder();

        for (String str : var){     //iterate through var array and append strings to string builder object
            s.append (str);

        }
        System.out.println(s);  //print out results of s
        System.out.println(s.toString());
    }

}
