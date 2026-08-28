// functions in java are something block of code that takes inputs, perform operations, and produces output.
/* syntax:
           returnType functionName(type arg1, type arg2..) {
           operations
           } 
           */

import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;  
        // return: to exit from the function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name); 
        //  call kiya function ko...
        sc.close();
    }
    
}
