/* Retrieve a Value from HashMap
 * Objective: Understand how to access a value in a HashMap using its key.
 * Task: Modify the existing HashMap program to retrieve a student's name
 * using their student ID as the key.
 * Output: Print the retrieved student's name to the console.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        //creating a HashMap
        Map<Integer, String> studentMap = new HashMap<>();

        //adding 5 entries to the map (ID, Name)
        studentMap.put(132423, "Afnan");
        studentMap.put(443456, "Shimaa");
        studentMap.put(734489, "Balqees");
        studentMap.put(187801, "Noura");
        studentMap.put(108643, "Tayba");

        Integer idToFind = 132423; //ID of student

        //retrieving student name assigned to ID
        System.out.println("\nID: "  + idToFind +  ", Student name: " + studentMap.get(132423));


    }
}
