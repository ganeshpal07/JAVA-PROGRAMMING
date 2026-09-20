public class BitManipulation {
    // Operations:
    // 1. Get bit: bitmask(i<<1) then use AND(&) operator to original nnumber.
    public static void main(String[] args) {
        // int n=5;
        // // 0101
        // int pos=2;
        // int bitMask=1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // } else {
        //     System.out.println("bit was one");
        // }
        
        // set in  bit: i) bitmask(i<<1)  ii) operation Or
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask|n;
        System.out.println(newNumber);
    }

    
}
