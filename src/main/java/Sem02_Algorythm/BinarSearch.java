package Sem02_Algorythm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarSearch {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println(bunarySearch(7, arr, 0, arr.length));
    }

    /**
     * @apiNote алгоритм бинарного поиска
     * @param value значение поиска
     * @param arr входной массив
     * @param min
     * @param max
     * @return индекс бинарного поиска
     */
    private static int bunarySearch(int value, int[] arr, int min, int max) {
        int middle;
        if (max < min) {
            return -1;
        } else {
            middle = (max-min)/2+min;
        }
        if(arr[middle]<value){
            return bunarySearch(value,arr,middle+1,max);
        }else {
            if(arr[middle]>value){
                return bunarySearch(value,arr,min,middle-1);
            }else {
                return  middle;
            }
        }
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
            result[i] = random.nextInt(20);
        }
        return result;
    }
}

