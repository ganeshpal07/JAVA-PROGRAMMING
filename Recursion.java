public class Recursion {

    // a function that calls itself.
    // recursion is a method of solving computational problem where the solutions depend upon solutions to 
    // "smaller instances of same problem"
    public static void printNum(int n){
        if(n==0)
            // base case
            return;
        System.out.println(n);
        printNum(n-1);
        // recursion 
    }
    public static void main(String[] args){
        int n=10;
        printNum(n);
    }
}
