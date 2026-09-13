// insertion sort: pick an element from unsorted array and place it at correct position in sorted array.

public class Insertion {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 7, 2, 3};

        for(int i=1; i<arr.length; i++) {
            // index 1 se start karenge kyunki index 0 already sorted hai.
            int current  = arr[i];
            // current variable me current element store kar liya from unsorted array.
            int j = i-1;
            // j variable me current element ke previous index ko store kar liya.

            while(j>=0 && arr[j] > current) {
                /*
                jab tak j>=0 hai aur arr[j] > current hai, tab tak elements ko right shift karte rho.
                */
                arr[j+1] = arr[j];
                // ek element ko right shift kar diya aur current element ke liye space bana diya.
                j--;
            }
            arr[j+1] = current;
            // jaise hi condition false ho jati hai, current element ko uski correct position pe insert kar diya.
        }
        printArray(arr);
    }
    
}
