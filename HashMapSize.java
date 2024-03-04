/* Find the Size of a HashMap
 * Objective: Understand how to find the size of a HashMap.
 * Task: Write a segment of code that finds and prints the size of your HashMap.
 * Output: The size of the HashMap printed to the console.*/

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

        //printing size of HashMap
        System.out.println("\nNumber of entries in map: " + studentMap.size());
    }
}
