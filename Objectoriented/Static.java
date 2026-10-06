public class Static {
    public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.SchoolName = "abc";
//         Student s2 = new Student();
//         System.out.println(s2.SchoolName);
        Horse h = new Horse();
        System.out.println(h.color);
    }    
}
// class Student{
//     static String SchoolName;
// }


// <--------SUPER KEYWORD-------->
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructer called");
        
    }
}
class Horse extends Animal{
    Horse(){
        super();
        // main class m horse class ka object banate hi super class ka constructor call ho jata h
        // output: animal constructor called  >   horse constructor called    > brown
        super.color = "brown";  
        System.out.println("horse constructer called");
    }
}
