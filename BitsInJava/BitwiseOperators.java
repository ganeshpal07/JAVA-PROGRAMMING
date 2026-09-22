public class BitwiseOperators {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args){
        // Binary and(&): both valus are true then true otherwise false.
        // System.out.println(5&6);

        // Binary Or(|): both values 0 then 0 otherwise 1.
        // System.out.println(5|6);

        // Binary Xor(^): similar values = false(0) otherwise true(1)
        // System.out.println(5^6);

        // Binary one's compliment(~): convert 0 to 1 and 1 to 0
        /*
        LSB: rightmost bit
        MSB: leftmost bit... if msb=0 then +ve if msb=1 then -ve
        :: to get actual value of negative number: find 1's compliment then add 1 into it : 
        {this whole process is called two's compliment}
        */
    //    System.out.println(~5);
       // binary left shift(<<): shifting position to left. (number<<position)
    //    formula: {a<<b = (a*2^b)}
    //    System.out.println(5<<3);

    //    binary right shift(>>): shifting position to right. (number>>position).
    //  formula: {a>>b = (a/2^b)}
    // System.out.println(5>>2);
     
    // ques:1 check if a number is odd or even
    int n = 9;
    oddOrEven(n);


    }
    
}
