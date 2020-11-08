package lesson3;

public class BubbleSort {
    public void sort(int[] arr) {
        boolean isSorted = true;
        int count = 0;
        while(isSorted) {
            isSorted = false;
            for(int i = 0; i < arr.length - i - count; i++) {
                if(arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isSorted = false;
                }
            }
            count++;
        }
    }
}
