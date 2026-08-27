//  patterns in java uses the concept of nested loops.
import java.util.*;
// printing solid rectangle pattern


public class Patterns {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 4;
    //     int m = 5;

        // outer loop
    //     for(int i = 1; i<=n; i++) {
    //         // inner loop
    //         for(int j = 1; j <=m; j++) {
    //             System.out.print("*");

    //    agar hum yha "println" use karte to ek star 
    //    print hota aur next line m chale jata....

    //         }
    //         System.out.println();
    //     }
    //     sc.close();

    // }




    // now printing same pattern by taking input from user

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();

    //     for(int i = 1; i<=n; i++) {
    //         for(int j = 1; j<=m; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }



    //  printing hollow rectangle.....

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 4;
    //     int m = 5;

        // outer loop
        // for(int i = 1; i<=n; i++) {
            // inner loop
            // for(int j = 1; j<=m; j++) {
                //  cell --> (i,j)
                // if(i==1 || j==1 || i==n || j==m) {
                //     System.out.print("*");
                // } else {
                //     System.out.print(" ");
                // }
                //  agar hum yha else m space print nhi karenge to 
                // rectangle hollow nhi banega aur uski boundary empty space ki jagah print ho jaaegii
                
    //         }
    //         System.out.println();
    //     }
    //     sc.close();

        
    // }



    // printing "half pyramid"

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 4;

    //     for(int i = 1; i<=n; i++) {
    //         for(int j = 1; j<=i; j++) {
                // yha j-- i tak chalegaa kyuki i matlab upper limit
                // and upper limit ----> kitne stars print honge 
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }


    // printing "inverted half pyramid".....

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 4;

    //     for( int i = n; i>=1; i--) {
            // here i=n : 4 stars print se start hoga aur; 4 rows
            // i>=1 : 4 stars se 1 stars tak print hoga;
            // i-- : har line ke baad i ki value decrease hoti jaaegi..
    //         for(int j = 1; j<=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // }


    // printing "half pyramid: mirror angle"

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = 4;

        // outer loop
        for(int i = 1; i<=n; i++) {
            // inner loop 1 : for printing space
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // inner loop 2: for printing stars
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }


}
