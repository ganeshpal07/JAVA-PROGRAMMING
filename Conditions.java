import java.util.*;
public class Conditions {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     if (age > 18){
    //         System.out.println("Adult");
    //     } else {
    //         System.out.println("Not Adult");

    //         sc.close();
    //     }
    // }
        //  public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     if (a % 2 == 0){
        //         System.out.println("even");
        //     } else {
        //         System.out.println("odd");

        //         sc.close();
        //     }
            

        //  }
        
            //  public static void main(String[] args){
            //     Scanner sc  = new Scanner(System.in);
            //     int a = sc.nextInt();
            //     int b = sc.nextInt();

            //     if(a == b){
            //         System.out.println("equal");
            //     } else { 
            //         if(a > b){
            //             System.out.println("greater");
            //         } else {
            //             System.out.println("smaller");

            //             sc.close();
            //         }
            //     }
                
            //  }



            // now using else if ladder.
            // public static void main(String[] args){
            //     Scanner sc = new Scanner(System.in);
            //     int a = sc.nextInt();
            //     int b = sc.nextInt();

            //     if(a == b){
            //         System.out.println("equal");
            //     } else if(a > b){
            //         System.out.println(" a is greater");
            //     }
            //     else {
            //         System.out.println(" a is lesser");
            //     }
            //       sc.close();
                

            // }



            // switch in java.........

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int button = sc.nextInt();

                switch(button){
                    case 1 : System.out.println("hello");
                    break;
                    case 2 : System.out.println("namaste");
                    break;
                    case 3 : System.out.println("bonjour");
                    break;
                    default : System.out.println("invalid");

                    sc.close();
                }
            }
}
