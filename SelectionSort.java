public class SelectionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 7, 2, 3};

        for(int i=0; i<arr.length-1; i++) {
            // n-1 turns chalega kyunki last element automatically sorted hoga.
            int smallest = i;
            // smallest element ka index store karne ke liye variable smallest banaya.
            for(int j=i+1; j<arr.length; j++){
                // inner loop: i+1 se last index tak chalega.
                if(arr[smallest] > arr[j]) {
                    // agar current element smallest element se chhota hai, toh uska index store karo.
                    smallest = j;
                    // smallest variable ko update kar diya.
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            // swap kar diya smallest element ko current index ke sath.
        }

        printArray(arr);
    }
    
}
