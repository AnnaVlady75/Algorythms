package Sem01_Algorythm;

import java.util.Scanner;

public class Sem01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fib(scanner.nextInt()) = " + fib(scanner.nextInt()));
    }

    /**
     * @param n член последовательности Фибоначчи
     * @return значение
     * @apiNote алгоритм поиска нужного числа последовательности Фибоначчи(Линейный алгоритм).
     */
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[n];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            return numbers[n - 1];
        }
    }
}
