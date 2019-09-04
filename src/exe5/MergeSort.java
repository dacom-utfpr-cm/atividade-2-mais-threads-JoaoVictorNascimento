package exe5;

import java.util.Arrays;
public class MergeSort implements Runnable {
    private int [] vetor;

    public MergeSort(int[] vector) {
        this.vetor = vector;
    }

    public static void MergeSortArray(int[] vetor) {
        MergeSortArray(vetor, 0, vetor.length - 1);
    }

    private static void MergeSortArray(int[] input, int start, int end) {

        // break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end) {
            int finalStart = start;
            Thread t1 = new Thread(()-> MergeSortArray(input, finalStart, mid));
            Thread t2 = new Thread(()-> MergeSortArray(input, mid + 1, end));

            t1.start();
            t2.start();

            try{
                t1.join();
                t2.join();
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }

        // merge solved pieces to get solution to original problem
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }

    @Override
    public void run(){
        System.out.println(Arrays.toString(vetor));
        MergeSortArray(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
