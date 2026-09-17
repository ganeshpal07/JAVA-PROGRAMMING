// String: stores words, text, sentences and paragraphs.
/*
there are two ways of writing string in java.
1. String str = "abcd"
2. String str = new String("xyz")
.. strings are immutable in nature means they cannot be changed after execution. 
*/
// import java.util.*;

public class StringExample {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //     // name = sc.next(); used to print only a single word.
    //     name = sc.nextLine();
    //     // used to print a whole sentence and paragraphs.
    //     System.out.println(name);
    //     sc.close();
        
    // }

    // public static void main(String[] args) {
    //     // String fullName = "Ganesh Pal";
    //     // System.out.println(fullName.length());
    //     // used to calculate length of a string.

    //     // string concatenation......
    //     String firstName = "Ganesh";
    //     String lastName = "Pal";
    //     String fullName = firstName + " " + lastName;
    //     // this adding of string is known as concatenation. 
    //     System.out.println(fullName);

    //     // charAt(index) method is used to findout any character of a string.
    // }

    // to print every character of a string.

    // public static void printLetters(String str) {
    //     for(int i=0; i<str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     String firstName = "Ganesh";
    //     String lastName = "Pal";
    //     String fullName = firstName + " " + lastName;

    //     printLetters(fullName);
    // }

    // check if a string is palindrome.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String str;
    //     str = sc.next();

    //     for(int i=0; i<str.length()/2; i++) {
    //         // jab tak index half string se chhota h tab takk loop chalega.
    //         int n = str.length();
    //         if(str.charAt(i) != str.charAt(n-i-1)) {
    //             // agar character str index is not equal to its opposite character then not a  palindrome.
    //             System.out.println("not a palindrome");
    //             // agr humm break use nhi karte aur loop ke inside hi print karte to jab tak charcter mid tak nhi 
    //             // reach karta tab tak "not a palindrome" aur "is palindrome" print hota
    //             break;
    //         } 
    //     }
    //     System.out.println("is palindrome");
    //     sc.close();

    // }

    // comparing strings

    public static void main(String[] args){
        String s1 = "ganesh";
        String s2 = "ganesh";
        String s3 = new String("ganesh");

        // if(s1==s2){
        //     System.out.println("equal"); equal
        // } else {
        //     System.out.println("not equal");
        // }

        // if(s1==s3){
        //     System.out.println("equal");
        // } else{
        //     System.out.println("not equal");   not equal
        // }
    }

    
}
