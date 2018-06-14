import java.util.Arrays;

import linkList.Linkedlist;

public class moreCoding{
    
    public static void main(String[] args) {
    	
    	// 1. Revese Linked List
    	Linkedlist list = new Linkedlist();
    	list.push(10);
    	list.push(15);
    	list.push(5);
    	list.push(4);
    	list.push(1);
    	list.printList();
    	list.reverseLL();
    	list.printList();
    	
    	// 2. Given an array and int m, find average of m groups in o(n)
    	int[] arr = {2, 5, 7, 1, 9, 3, 9};
        int m = 4;
        float avg = avgofMgrps(arr, m);
        System.out.println("Average of " + m + " groups in " + Arrays.toString(arr) + " is " + avg);
    } // main

    // 1. Reverse linked list
    

    // 2. Given an array and int m, find average of m groups in o(n)
    public static float avgofMgrps(int[] arr, int m) {
    	
    	float avgSum = 0;
    	float sum = 0;
    	int i = 0;
    	
    	for(; i < m; i++) {
    		sum = sum + arr[i];
    	}
    	avgSum = avgSum + sum/m;
    	
    	for(; i < arr.length; i++) {
    		sum = sum - arr[i-m] + arr[i];
    		avgSum = avgSum + (sum/m);
    	}
    	
    	return (avgSum / (arr.length - m + 1));
    	
    } // avgOfMgrps
    
    // 3. Given an array and target, find all pairs whose sum is equal to target.

    // 4. Brackets Matching

    // 5. Pair of range, merge them

    // 6. Add two linked lists

    // 7. First unique character in a string

    // 8. Write a functions that finds and returns the node with the second highest value in a Binary Search Tree. 
    // Assume BST is valid, but not necessarily complete or balanced.

    // 9. Largest sum of path in 2D array.

    // 10. Reverse the order of words in a sentence.

    // 11. Validate BST

    // 12. 

} // moreCoding

