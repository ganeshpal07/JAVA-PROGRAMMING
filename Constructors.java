/*constructors--> are the method which is invoked automatically at the time of object creation.
have same namee as class
dont have return type not even void
only called at once; memory allocations happens */ 

public class Constructors {
    // 1.Non-parameterized constructors-
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "ganesh";
        
    }
}

class Students{
    String name;
    int roll;

    Students(){
        System.out.println("construtor is called");
    }
}
