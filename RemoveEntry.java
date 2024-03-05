/* Remove an Entry from HashMap
 * Objective: Understand how to remove an entry from a HashMap.
 * Task: Write a code segment that removes a student from the HashMap using their student ID.
 * Output: Print the updated HashMap to the console.*/

import javax.naming.InsufficientResourcesException;
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

        //printing HashMap
        printMap(studentMap);

        Integer removeID = 132423; //ID to be used for removing entry

        //remove an entry from the HashMap using ID
        studentMap.remove(removeID);

        //printing HashMap after removal
        printMap(studentMap);

    }

    // Method to print the HashMap
    public static void printMap(Map<Integer, String> map) {
        for (Integer id : map.keySet()) {
            System.out.println("\nID: " + id + ", Student Name: " + map.get(id));
        }
    }
}
}
