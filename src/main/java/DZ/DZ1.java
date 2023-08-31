package DZ;
import java.util.Random;
import java.util.Scanner;
public class DZ1 {
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
     * Перегруппировка массива, извлечение элементов и перемещение корня в конец
     * @param arr
     * выозов массива на уменьшенной куче
     */
    public static void pyramidSort(int arr[]) {
        int n= arr.length;
        for (int i = n/2-1; i >=0 ; i--) {
            massive(arr,n,i);
        }
        for (int i = n-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            massive(arr,i,0);
        }
    }
    /**
     * преобразование в двоичную кучу поддерева с корневым узлом i
     * @param arr
     * @param n размер кучи
     * @param i индекс массива
     */
    static void massive(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        /**
         * если левый элемент больше корня записываем в наибольший элемент
         */
        if(left<n && arr[left]>arr[right]) {
            largest = left;
        }
        if (right<n&&arr[right]>arr[largest]) {
            largest = right;
        }
        /**
         * преобразование в двоичную систему "подмассив"
         */
        if (largest!=i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            massive(arr, n, largest);
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
