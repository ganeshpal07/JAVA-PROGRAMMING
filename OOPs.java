// Way od writing a code.

//  classes and objects.
/* -->a class in java is a blueprint or template used to create objects. it defines properties and methods of objects 
 -->an object in java is an instance of class, it reprsents a real entity and is used to acess the variables and 
 method defined in class.
 */

public class OOPs{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         // created object s1 student

//         s1.setName("Ganesh Pal");
//         System.out.println(s1.name);
//     }    
// }

// class Student{
//     String name;
//     int age;

//     void setName(String Name){
//         name = Name;
//     }


// getters and setters.....

public static void main(String[] args){
    Pen p1 = new Pen();
    p1.setcolor("blue");
    System.out.println(p1.getColor());

}
}

class Pen{
    private String color;
    String getColor(){
        return this.color;
    }
    void setcolor(String newColor){
        color = newColor;
    }
}