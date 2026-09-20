import java.util.*;

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
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask|n;
        // System.out.println(newNumber);


        // Clear Bit: bitmask(i<<1); -------> and with original n.
        // int n =5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Update bit: 
        // for 0: bitmask(i<<1)--> AND with NOT.
        // for 1: bitmask(i<<1)--> OR.

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n =5;
        int pos =1;
        int bitMask = 1<<pos;

        if(oper==1){
            int newNumber = bitMask|n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask;
            System.out.println(newNumber);
        }
        sc.close();
    }

    
}
