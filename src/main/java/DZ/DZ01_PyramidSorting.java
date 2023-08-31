package DZ;

import java.util.Random;
import java.util.Scanner;

//Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
public class DZ01_PyramidSorting {
    private static final Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = prepareArray(n);
        printArray(arr);
        pyramidSort(arr);
        printArray(arr);
    }
    /**
     * @param i элемент
     * @return возвращаю левого и правого потомка array[i]
     */
    private static int LEFT(int i) {
        return (2 * i + 1);
    }
    private static int RIGHT(int i) {
        return (2 * i + 2);
    }
    /**
     * заменяю индексы в массиве
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /**
     * рекурсивный метод.
     * @param array
     * @param i
     * @param size
     */
    private static void heapify(int[] array, int i, int size) {
        /**
         * нахожу левый и правый потомки узла с индексом `i`
         */
        int left = LEFT(i);
        int right = RIGHT(i);
        /**
         * array[i]  сравниваю  с его левым и правым дочерними элементами
         * и нахожу наибольшее значение
         */
        int largest = i;
        if (left < size && array[left] > array[i]) {
            largest = left;
        }
        if (right < size && array[right] > array[largest]) {
            largest = right;
            /**
             * меняю местами с потомком, имеющим большее значение и
             * вызоваю heapify-down для дочернего элемента
             * */
            if (largest != i) {
                swap(array, i, largest);
                heapify(array, largest, size);
            }
        }
    }
    /**
     * Функция для удаления элемента с наивысшим приоритетом
     * @param array
     * @param size размер массива
     * @return
     */
    public static int pop(int[] array, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = array[0];
        /**
         * заменяю корень кучи последним элементом массива
         */
        array[0] = array[size - 1];
        heapify(array, 0, size - 1);
        return top;
    }
    /**
     * Функция для выполнения пирамидальной сортировки массива c размером `n`
     * @param array
     */
    public static void pyramidSort(int[] array) {
        /**
         * приоритетная очередь и инициализизация ее заданным массивом
         */
        int n = array.length;
        /**
         *вызов heapify, начиная с последнего внутреннего узела
         * до корневого узла
         */
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(array, i--, n);
        }
        while (n > 0) {
            array[n - 1] = pop(array, n);
            n--;
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
            result[i] = random.nextInt(100);
        }
        return result;
    }
}

