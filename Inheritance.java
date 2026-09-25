public class Inheritance {
    // when properties and methods from base/parent class transfered or passed to an child/derived class.
    // public static void main(String[] args){
        // Fish shark = new Fish();
        // shark.breathe();

        // Dog tuffy = new Dog();
        // multilevel inheritance.
        // tuffy.legs = 4;
        // System.out.println(tuffy.legs);


        // hieararchial inheritace:
//         Fish shark = new Fish();
//         shark.swims();
//     }
// }
// class Animal{
    // base class/parent class
//     String color;
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// class Fish extends Animal{
//     // derived/child/subclass
//     int fins;
//     void swims(){
//         System.out.println("fish swims");
//     }
// }


// multilevel inheritance: from a single base class to derived class and from it to one more derived class and more.
// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }

// Hierarchial inheritance: from a single base class to many derived class.
// animal--> mammal, bird, fish.

// class Mammal extends Animal{
//     void walk(){
//         System.out.println("can walk");
//     }
// }
// class Fish extends Animal{
//     void swims(){
//         System.out.println("can swim");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("can fly");
//     }
// }


// hybrid inheritance: combination of two or more types of inheritance in one program.

    public static void main(String[] args) {

        // Hybrid inheritance
        Puppy p = new Puppy();

        p.breathe();
        p.walk();
        p.play();

        Bird b = new Bird();

        b.breathe();
        b.fly();
    }
}

class Animal {
    // base class / parent class
    String color;

    void breathe() {
        System.out.println("breathes");
    }
}

// Animal --> Mammal
class Mammal extends Animal {
    void walk() {
        System.out.println("can walk");
    }
}

// Mammal --> Puppy
// Multilevel inheritance
class Puppy extends Mammal {
    void play() {
        System.out.println("can play");
    }
}

// Animal --> Bird
// Hierarchical inheritance
class Bird extends Animal {
    void fly() {
        System.out.println("can fly");
    }
}



// there is also one more type of inheritance known as "Multiple inheritance:" 
// it is not used in java but in c++. it cannot used in java by classes but can be used by interfaces.