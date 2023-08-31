package Sem02_Algorythm;

import java.util.Random;
import java.util.Scanner;

public class Ex02_2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        printArray(bubbleSortedArray(arr));
    }

    /**
     * @param arr массив для печати
     * @apiNote распечатать массив на экран
     */

    private static void printArray(int[] arr) {
        String result = "massive = [";
        for (int i = 0; i < arr.length; i++) {
            result += " " + arr[i] + " ,";
        }
        result = result.substring(0, result.length() - 1);
        result += " ]";
        System.out.println(result);
    }

    /**
     * @param length размерность массива
     * @return массив
     * @apiNote подготовка массива случайных чисел
     */
    private static int[] prepareArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }
    private static int[] bubbleSortedArray(int[] arr){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        return arr;
    }

}
