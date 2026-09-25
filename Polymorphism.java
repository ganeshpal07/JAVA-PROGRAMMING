public class Polymorphism {
    // many forms; ability of one method or object to behave differently in different situations.\

    // compile time:(method overloading)[static]: method to be executed is decided by compiler at compile time.
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.err.println(calc.sum(1, 2));
        System.err.println(calc.sum(1.5, 2.5));
        System.err.println(calc.sum(1, 2, 3));
    }   
}
// Teen methods ka naam same sum() hai, lekin unke parameters different hain:
// Isko Method Overloading kehte hain, aur ye Compile-Time Polymorphism hai.
// Easy trick:
// Same method name + different parameters = Method Overloading.

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
