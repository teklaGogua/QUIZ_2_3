package oop.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This program processes two lists (list1 and list2) with predefined values.
 * The operations performed include:
 * - Creating and initializing list1 (integers) and list2 (strings)
 * - Creating list3 by using values from list1 as indices 
 * (integer hidden in list1 + (integer - 1)) to select strings from list2
 * - Handling potential index out of bounds scenarios
 */
public class Script {
    public static void main(String[] args) {
        // Initialize list1 with integer values
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 2, 3, 9, 2, 3, 8, 5, 3, 5, 2, 3, 6));
        System.out.println("list1 (integers): " + list1);

        // Initialize list2 with string values
        List<String> list2 = new ArrayList<>(Arrays.asList(
            "2tpA", "9N60w", "DFw", "mO9g6", "P2WD", "6DRX2", "RTVOb", "RHOY", "Ct2", "KRbtu", "Ym5Yu", "MW9", "5PPzD", "kem1C", "hmWJ", "9XTEQ", "12x", "Qzo8"
        ));
        System.out.println("list2 (strings): " + list2);

        // Create list3 by using list1 values as indices for list2
        List<String> list3 = createList3(list1, list2);
        System.out.println("list3 (result): " + list3);
    }

    /**
    * Creates list3 by using values from list1 to calculate indices for list2.
    * For each integer in list1, the index for list2 is calculated as:
    * index = integer + (integer - 1)
    * Handles cases where index might be out of bounds by skipping those values.
    * 
    * @param integers List of integers (from list1) used to calculate indices
    * @param strings List of strings (from list2) from which elements are selected
    * @return New list created by selecting strings from list2 using calculated indices
    */
    private static List<String> createList3(List<Integer> integers, List<String> strings) {
    List<String> result = new ArrayList<>();
    
    for (Integer num : integers) {
        // Calculate index: num + (num - 1)
        int calculatedIndex = num + (num - 1);
        
        // Check if calculated index is within bounds of list2
        if (calculatedIndex >= 0 && calculatedIndex < strings.size()) {
            result.add(strings.get(calculatedIndex));
        } else {
            System.out.println("Warning: Calculated index " + calculatedIndex + 
                             " is out of bounds for list2 (size: " + strings.size() + ")");
        }
    }
    
    return result;
    }
}
