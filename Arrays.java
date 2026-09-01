/*Arrays: is a list of items of the same data type placed in contiguous memory locations
Syntax: 
     dataType[] arrayName = new dataType[arraySize];
     [] : can be used before and after the array name
      0 based indexing */

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5]; // array of size 5. this is declaration of array.
        arr[0] = 23; // initialization of array or storing values in array.
        arr[1] = 11;
        arr[2] = 22;
        arr[3] = 10;
        arr[4] = 5;
        System.out.println(arr[0]); // accessing the array elements.
        System.out.println(arr[1]);

        //  in this code arr[0] or arr[1]; these 0, 1, 2, 3, 4 are called index of the array. 
        // and the value stored in that index is called element of the array.

        // to access all the elements of an array we can use for loop.
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
