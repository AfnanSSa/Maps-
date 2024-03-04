/*Create and Print HashMap
 * Objective: Learn how to create a HashMap in Java and add elements to it.
 * Task: Write a Java program to create a HashMap to store student IDs and names.
 * Use Integer for the student ID (key) and String for the student name (value).
 * Add 5 student entries to the HashMap.
 * Output: Print the entire HashMap to the console to verify the entries.*/

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args){
        //creating a HashMap
        Map<Integer, String> studentMap = new HashMap<>();

        //adding 5 entries to the map (ID, Name)
        studentMap.put(132423, "Afnan");
        studentMap.put(443456, "Shimaa");
        studentMap.put(734489, "Balqees");
        studentMap.put(187801, "Noura");
        studentMap.put(108643, "Tayba");

        //printing entries
        for (Integer entry : studentMap.keySet() ){
            System.out.println("\nID: " + entry + ", Student name: " +studentMap.get(entry));
        }
    }
}
