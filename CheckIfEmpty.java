/* Check if HashMap is Empty
 * Objective: Learn to check if a HashMap is empty.
 * Task: Add a code segment that checks if the HashMap is empty and prints the result.
 * Output: A boolean indicating if the HashMap is empty.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        //creating a HashMap
        Map<Integer, String> studentMap = new HashMap<>();


        //adding 5 entries to the first map (ID, Name)
        /*COMMENT THESE LINE FOR TESTING*/
        studentMap.put(132423, "Afnan"); 
        studentMap.put(443456, "Shimaa");
        studentMap.put(734489, "Balqees");
        studentMap.put(187801, "Noura");
        studentMap.put(108643, "Tayba");

        //checking if HashMap is empty
        if (studentMap.isEmpty()){
            System.out.println("\nMap is Empty");
        } else {
            System.out.println("\nMap is not Empty");
        }
    }
}
