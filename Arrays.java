/*Arrays: is a list of items of the same data type placed in contiguous memory locations
Syntax: 
     dataType[] arrayName = new dataType[arraySize];
     [] : can be used before and after the array name
      0 based indexing */

    // import java.util.*;
      public class Arrays {
    // public static void main(String[] args) {
        // int arr[] = new int[5]; // array of size 5. this is declaration of array.
        // arr[0] = 23; // initialization of array or storing values in array.
        // arr[1] = 11;
        // arr[2] = 22;
        // arr[3] = 10;
        // arr[4] = 5;
        // System.out.println(arr[0]); // accessing the array elements.
        // System.out.println(arr[1]);

        //  in this code arr[0] or arr[1]; these 0, 1, 2, 3, 4 are called index of the array. 
        // and the value stored in that index is called element of the array.

        // to access all the elements of an array we can use for loop.
        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

    // }



    // input/output in array
    // public static void main(String[] args) {
    //     int marks[] = new int[10];
    //     // array of size 10 is created.
    //     Scanner sc = new Scanner(System.in); 
    //     // Scanner class is used to take input from user. we have to import java.util.*; for using Scanner class.

    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();
    //     // taking input from user and storing it in array.

    //     System.out.println("Physics: " + marks[0]);
    //     System.out.println("Chemistry: " + marks[1]);
    //     System.out.println("Maths: " + marks[2]);
    //     // printing the values stored in array.   output

    //     // we can update marks by following method.
    //     marks[2] = 89;
    //     System.out.println("Updated Maths: " + marks[2]);

    //     // we can also change marks by following method.
    //     marks[0] = marks[0] + 1;
    //     System.out.println("changed Physics: " + marks[0]);

    //     // we can also identify the size of an array by using length property of array.
    //     System.out.println("Size/Length of array: " + marks.length);
    //     sc.close();
    // }


    // taking size of an array as an input:

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     // ye size variable user se input lega ki array ka size kitna hoga.

    //     int marks[] = new int[size];

    //     for(int i=0; i<size; i++) {
    //         marks[i] = sc.nextInt();
    //         // taking input from user and storing it in array.

    //     }
    //     System.out.println("Physics: " + marks[2]);
    //     sc.close();
    // }


    // Passing arrays as an arguement.
    /* 1. pass by values: changes in function are not reflected in main function
    2. pass by reference: changes in function are reflected in main function
    ------ arrays are passed by refrenece only. */

    
    public static void update(int marks[]) {
        // small function to update the marks array. this function will add 1 to each element of the array.
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
            // this will update the marks array by adding 1 to each element of the array.
        }
    }
    public static void main(String[] args) {
        // main function.
        int marks[] = {23, 11, 12};
        update(marks);
        // function call to update the marks array.

        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);
        }
        // update(marks);
        // System.out.println("After updating:");
        // for(int i=0; i<marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // this is detiled code for expalnation of passing array as an arguement.

    }
}
