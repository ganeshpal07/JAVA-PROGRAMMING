// // for loops
// public class Loops {
//     public static void main(String[] args) {
//         for (int counter = 0; counter < 5; counter = counter + 1) {
//             System.out.println("crack Gsoc");
//         }
//     }
// }


// for loop syntax....
// for (initialisation; condition; updation)

// ques: print numbers from 1 to 10...

// public class Loops{
    // public static void main(String[] args) {
    //     for (int counter = 0; counter < 11;  counter++) {
    //         // System.out.println(counter);
    //         //  here counter ++ => counter = counter +1
    //         // to print output in same line ...
    //         System.out.println(counter+" ");
    //     }  
    // }



    //  ......WHILE LOOPS.........

    // public static void main(String[] args) {
    //     int counter = 0;
    //     while(counter < 5) {
    //         System.out.println(counter);
    //         counter = counter + 1;
    //     }
    // }    


    // ......DO WHILE LOOPS........

    // public static void main(String[] args) {
    //     int counter = 0;
    //     do {
    //         System.out.println(counter);
    //         counter = counter + 1;
    //     } while (counter < 5);
    // }


    // difference between while and do while loop...

    // public static void main(String[] args) {
    //     int i = 5;
    //     while(i < 4) {
    //         System.out.println("hello");
    //     }

        // here output will not run as condition is checked first

    //     do {
    //          System.out.println("crack gsoc");
    //     } while (i < 4);
    // }

    // output will run at once and then check
    //the condition if false stop if true will continue..

 

// }

// print sum of first n natural numbers..


import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         for(int i = 1; i<=n; i++) {
//             sum = sum + i;
//         }
//         System.out.print(sum);
//         sc.close();

//     }
// }
// if n is given then write: int n = whatever given





// printing the table of a number input by user...
public class Loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<= 10; i++) {
            System.out.println(i*n);
            sc.close();
        }
    }
}