/* Iterate Over HashMap Using entrySet()
 * Objective: Master iterating over a HashMap using the entrySet() method.
 * Task: Modify your program to iterate through the HashMap and print all key-value
 * pairs using the entrySet() method.
 * Output: All key-value pairs printed to the console.*/

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

        //iterate through HashMap
        for (Map.Entry<Integer, String> intry : studentMap.entrySet()){
            System.out.println("\n " + intry);
        }
    }
}
