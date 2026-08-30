// functions in java are something block of code that takes inputs, perform operations, and produces output.
/* syntax:
           returnType functionName(type arg1, type arg2..) {
           operations
           } 
           */

import java.util.*;

public class Functions {
    // public static void printMyName(String name) {
    //     System.out.println(name);
    //     return;  
    //     // return: to exit from the function
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name); 
    //     //  call kiya function ko...
    //     sc.close();
    // }
    
    
    // make a function to add two numbers and return the sum.

    // public static int calculateSum(int a, int b) {
    //     int sum = a+b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     // called function
    //     System.out.println("sum of 2 numbers is :" +sum);
    //     sc.close();
    // }


    // make a function to multiply 2 numbers and return the product.

    // public static int calculateProduct(int a, int b) {
        
    //     return a*b;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

        
    //     // called function
    //     System.out.println("product of 2 numbers is :" +calculateProduct(a, b));
    //     sc.close();
    // }


    // to print factorial of a number..
    // factorial => n!= n*(n-1) * (n-2) * (n-3).....*1
    //  0! = 1

    public static void printFactorial(int n) {
        int factorial = 1;
        //  creating a variable whose initial value is 1 because factorial is calculated using multiplication and 0*n = 0
        if(n < 0) {
            System.out.println("invalid number");
            return;
        }
        for(int i=n; i>=1; i--) {
            factorial = factorial*i;
            // "Purani factorial value ko i se multiply karo aur jo answer aaye, usko dobara factorial mein store karo."
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
        sc.close();
    }
}
