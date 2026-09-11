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
            int mid = (start+end)/2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = {23, 22, 12, 11, 10, 7 };
        int key = 23;

        System.out.println(binarySearch(numbers, key));
    }
}
