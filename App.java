import java.util.Arrays;
import java.util.Random;

public class App {

    public static void javaArraysSort(int[] array){
        // record time
        long startTime = System.nanoTime();
        // algorithm to test
        Arrays.sort(array);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime; // calculate time elapsed to complete algorithm

        //display results
        System.out.println("Sorted Array: "+ Arrays.toString(array));
        System.out.println("Time Elapsed (Nanoseconds): " + elapsedTime);
    }

    public static void bubbleSort(int[] array){
        int n = array.length; 
        long startTime = System.nanoTime();
        // bubble sort algorithm to sort
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // display results
        System.out.println("Bubble Sorted Array: "+ Arrays.toString(array));
        System.out.println("Time Elapsed (Nanoseconds): " + elapsedTime);

    }

    // driver to test 
    public static void main(String[] args) throws Exception {
        int n = 10000; // size n
        int[] array = new int[n]; //array of size n
        Random randomInt = new Random(); // new random generator

        int min = 0; // can set min and max values
        int max = 1000;
        for(int i = 0; i < n; i++) // inserting size n random integers
            array[i] = randomInt.nextInt(max-min) + min;
            
        javaArraysSort(array);
        System.out.println();
        bubbleSort(array);

    }
}

