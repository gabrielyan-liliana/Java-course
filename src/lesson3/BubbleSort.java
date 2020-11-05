package lesson3;

public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSorted;
        for(int i = 0; i < n; i++) {
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) {
                break;
            }
        }
    }
}
