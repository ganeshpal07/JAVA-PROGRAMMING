public class BitQuestions {
    public  static void main(String[] args) {
        // check if a number is power of two or not.
        int n = 12;
        if((n&(n-1))==0){
            System.out.println("power of two");
        } else{
            System.out.println("not a power of two");
        }
    }
    
}
