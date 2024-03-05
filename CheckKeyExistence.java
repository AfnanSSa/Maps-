/* Check Key Existence in HashMap
 * Objective: Learn to check for the existence of a key in a HashMap.
 * Task: Write a segment of code that checks if a specific student ID exists in the HashMap.
 * Output: Print a boolean value indicating the existence of the student ID.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        //creating a HashMap
        Map<Integer, String> studentMap = new HashMap<>();

        //adding entries to the first map (ID, Name)
        studentMap.put(132423, "Afnan");
        studentMap.put(443456, "Shimaa");
        studentMap.put(734489, "Balqees");
        studentMap.put(187801, "Noura");
        studentMap.put(108643, "Tayba");

        //checking and printing if a key (ID) exists in the HashMap
        if (studentMap.containsKey(132423)){
            //if true
            System.out.println("\nID is included in the HashMap");
        } else {
            //if false
            System.out.println("\nID is not included in the HashMap");
        }
    }
}

