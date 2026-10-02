public class Interface {
    // interface is a blueprint of a class.
    // ex: car(wheel, engine){interface} ----> maruti, honda, toyota{class} -------> car1 car2 car3{object}
    /*1. used to implement multiple inheritance.
    2. used to achieve total 100% abstraction
    3.to use interface we use "implements" */ 
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){ 
        // without public keyword it will give error because interface methods are by default public and abstract.
        System.out.println("Queen can move in any direction");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("King can move one square in any direction");
    }
}