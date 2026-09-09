public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        // array and key are passed as parameters to the function.
        for(int i=0; i<arr.length; i++) {
            // jab tak i arr ki length se chhota hoga tab tak loop chalega.
            if(arr[i] == key) {
                return i;
                // agar key arr ke kisi index par mil jata hai to uska index return kar do.
            }
        }
        return-1;
        // agar key arr ke kisi index par nahi milta hai to -1 return kar do.
    }
    public static void main(String[] args) {
        int arr[] = {45, 10, 87, 23, 22, 11, 12, 10, 7};
        int key = 23;
        int index = linearSearch(arr, key);
        // linearSearch function ko call kiya aur uska return value index variable me store kar diya.
        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
        
       
}

/*
linear search : kisi bhi element ko agar hum arraay m one by one check
karte h ki wo element array m hai ya nahi to usse linear search kehte h.
*/