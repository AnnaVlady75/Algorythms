package Sem02_Algorythm;

import java.util.Random;
import java.util.Scanner;

public class Ex02_3 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);

        printArray(quickSort(arr));
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
    public static int[] quickSort(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        if (arr.length == 0)
            return arr;

        if (low >= high)
            return arr;

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int oporaElem = arr[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < oporaElem) {
                i++;
            }

            while (arr[j] > oporaElem) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(arr);

        if (high > i)
            quickSort(arr);
        return arr;
    }
}
