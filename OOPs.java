// Way od writing a code.

//  classes and objects.
/* -->a class in java is a blueprint or template used to create objects. it defines properties and methods of objects 
 -->an object in java is an instance of class, it reprsents a real entity and is used to acess the variables and 
 method defined in class.
 */

// public class OOPs{
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

// public static void main(String[] args){
//     Pen p1 = new Pen();
//     p1.setcolor("blue");
//     System.out.println(p1.getColor());

// }
// }

// class Pen{
//     private String color;
//     String getColor(){
//         return this.color;
//     }
//     void setcolor(String newColor){
//         color = newColor;
//     }
// }





/*ENCAPSULATION:--> Encapsulation ka matlab hai data (variables) aur methods ko ek single 
class ke andar bind/wrap karna aur data ko direct access se protect karna.

Java mein usually variables ko private rakhte hain aur unhe access karne ke liye getter aur 
setter methods use karte hain. */

class Student {

    // private variables
    // Inhe directly class ke bahar access nahi kar sakte
    private String name;
    private int age;

    // Setter method
    // Is method se hum name ki value set karenge
    void setName(String name) {
        this.name = name;
    }

    // Getter method
    // Is method se hum name ki value read karenge
    String getName() {
        return name;
    }

    // Setter method for age
    void setAge(int age) {
        this.age = age;
    }

    // Getter method for age
    int getAge() {
        return age;
    }
}



public class OOPs{
    public static void main(String[] args) {

        // Student ka object banaya
        Student s1 = new Student();

        // Setter ke through values set ki
        s1.setName("Ganesh");
        s1.setAge(19);

        // Getter ke through values access ki
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
