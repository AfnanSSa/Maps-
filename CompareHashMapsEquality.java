/* Compare Two HashMaps for Equality
 * Objective: Learn to compare two HashMaps for equality.
 * Task: Create two HashMaps, add some entries, and write a code segment to check if they are equal.
 * Output: A boolean value indicating whether the two HashMaps are equal.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        //creating 2 HashMaps
        Map<Integer, String> studentMap1 = new HashMap<>();
        Map<Integer, String> studentMap2 = new HashMap<>();

        //adding 5 entries to the first map (ID, Name)
        //studentMap1.put(132423, "Afnan"); //uncomment this for testing 
        studentMap1.put(443456, "Shimaa");
        studentMap1.put(734489, "Balqees");
        studentMap1.put(187801, "Noura");
        studentMap1.put(108643, "Tayba");

        //adding 5 entries to the second map (ID, Name)
        studentMap2.put(443456, "Shimaa");
        studentMap2.put(734489, "Balqees");
        studentMap2.put(187801, "Noura");
        studentMap2.put(108643, "Tayba");

        //checking if HashMaps are equal
        if (studentMap1.equals(studentMap2)){
            System.out.println("\nHashMaps are equal");
        } else {
            System.out.println("\nHashMaps are not equal");
        }
    }
}
