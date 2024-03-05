/* Iterate Over HashMap Using keySet()
 * Objective: Learn to iterate over a HashMap using the keySet() method.
 * Task: Write a program that iterates through the HashMap and prints all
 * key-value pairs using the keySet() method.
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

        //printing HashMap
        printMap(studentMap);
    }

    // method to print the HashMap
    public static void printMap(Map<Integer, String> map) {
        for (Integer id : map.keySet()) {
            System.out.println("ID: " + id + ", Student Name: " + map.get(id));
        }
    }
}

