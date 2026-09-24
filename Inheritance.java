public class Inheritance {
    // when properties and methods from base/parent class transfered or passed to an child/derived class.
    public static void main(String[] args){
        // Fish shark = new Fish();
        // shark.breathe();

        Dog tuffy = new Dog();
        tuffy.legs = 4;
        System.out.println(tuffy.legs);
    }
}
class Animal{
    // base class/parent class
    String color;
    void breathe(){
        System.out.println("breathes");
    }
}
// class Fish extends Animal{
//     // derived/child/subclass
//     int fins;
//     void swims(){
//         System.out.println("fish swims");
//     }
// }


// multilevel inheritance: from a single base class to many derived class.
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}