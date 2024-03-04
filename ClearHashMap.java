/* Clear a HashMap
 * Objective: Understand how to clear all entries from a HashMap.
 * Task: Write a code segment that clears the HashMap and then checks if it is empty.
 * Output: The HashMap should be empty, and your program should verify this.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        //creating a HashMap
        Map<Integer, String> studentMap = new HashMap<>();


        //adding 5 entries to the first map (ID, Name)
        studentMap.put(132423, "Afnan");
        studentMap.put(443456, "Shimaa");
        studentMap.put(734489, "Balqees");
        studentMap.put(187801, "Noura");
        studentMap.put(108643, "Tayba");

        //clearing HashMap
        studentMap.clear();

        //checking if HashMap is empty
        if (studentMap.isEmpty()){
            System.out.println("\nMap is Empty");
        } else {
            System.out.println("\nMap is not Empty");
        }
    }
}
