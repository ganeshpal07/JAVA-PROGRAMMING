// basic sorting algorithm: bubble sort
// large elements come at the end of the array in each iteration, by swapping with adjacent elements.

public class BubbleSort {
    public static void bubbleSort(int arr[]) { 
        for(int turn=0; turn<arr.length-1; turn++){
            // outer loop: last index tak chalegaa.
            for(int j=0; j<arr.length-1-turn; j++) {
                // inner loop: last index - turn(konsi turn h) tak chalegga.
                if(arr[j] > arr[j+1]) { 
                    //  agar array m j wala element j+1 wale element se bada h to swap krdo.
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr); 
        // array ko sort kara diya bubble sort function execute kar kar
        printArray(arr);
        // sorted array ko print kar diya printArray function execute kar kar
        
    }
    
}
