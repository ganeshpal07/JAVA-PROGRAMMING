// public class Variables {
//     public static void main(String[] args){
//         String name = "ganesh";
//         int age = 18;
//         int a = 7;

//         System.out.println("My name is " + name);
//         System.out.println(age);
//         System.out.println(a);

//         int c = 87;
//         int d =13;
//         int sum = c + d;
//         int multiply = c * d;
//         System.out.println(sum);
//         System.out.println(multiply);

//     }
    
// }

// inputs in java.

// import java.util.*;

// public class Variables {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.next();
//         // System.out.println(name);
//         String name1 = sc.nextLine();
//         System.out.println(name1);

//         sc.close();
//     }

// }

// sc.next() - it will take only one word as input.
// sc.nextLine() - it will take the whole line as input.    


// practice questions: take 2 variable a nd b and print thier sum.

import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);
        sc.close();


    }
}