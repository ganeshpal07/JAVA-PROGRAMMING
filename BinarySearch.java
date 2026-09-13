// for binary search aaray should be sorted.
/*
PSEUDOCODDE:-
    start = 0  end = n-1
    while(start <= end)
       find mid
    compare mid and key
      mid==key :- found
      mid>key :- left side
      mid<key :- right side
*/

// import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[],  int key) {
        int start = 0; 
        int end = numbers.length - 1;

        while(start<=end) {
            // jabtak start <= end hai tab tak loop chalega.
            int mid = (start+end)/2;
            if(numbers[mid] == key) {
                return mid;
                // agar mid == key hai to mid ka index return kar do.
            }
            if(numbers[mid] < key) {
                start = mid+1;
                // agar mid < key hai to start ko mid+1 kar do.
            }
            else{
                end = mid-1;
                // agar mid > key hai to end ko mid-1 kar do.
            }
            
        }
        return -1;
        // agar key array me nahi hai to -1 return kar do.

    }

    public static void main(String[] args) {
        int numbers[] = {7, 10, 11, 12, 22, 23};
        int key = 23;

        System.out.println(binarySearch(numbers, key));
        // calling binarySearch function and printing the index of key in the array.
    }
}
