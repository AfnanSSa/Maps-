/* Climbing Stairs
 * Create a function to determine the number of distinct ways to climb to the top of a
 * staircase with n steps. At each step, you may choose to climb either 1 or 2 steps.
 * The goal is to calculate all the unique combinations that can be used to reach the top.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCombinations {
    static Map<Integer, Integer> stairs = new HashMap<>(); //creating a HashMap

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter number of steps: "); //prompting user to enter number of steps
        Integer steps = scanner.nextInt();

        if (steps >= 0) {
            System.out.println("\nNumber of ways to climb the stairs: " + climbingStairs(steps)); //printing result
        }
    }

    //method to calculate number of combinations to climb the stairs
    public static Integer climbingStairs(Integer steps) {
        if (steps == 0) { //if input is 0
            return 0;
        } else if (steps == 1 || steps == 2) { //if input is 1 or 2
            return steps;
        } else if (steps > 2) { //if input is more than 2

            //calculating combination and adding the value in HashMap
            stairs.put(steps, climbingStairs(steps - 1) + climbingStairs(steps - 2));
            
        }
        return stairs.get(steps); //getting the value
    }
}
