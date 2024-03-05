/* Iterate Over HashMap Values
 * Objective: Learn to iterate over just the values of a HashMap.
 * Task: Write a program that iterates through the values of the HashMap and prints each one.
 * Output: All values printed to the console.*/

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
        for (String value : studentMap.values()){
            //printing each ID with student name assigned to
            System.out.println(value);
        }
    }
}
