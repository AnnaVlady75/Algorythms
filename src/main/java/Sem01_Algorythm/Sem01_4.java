package Sem01_Algorythm;

import java.util.Scanner;

public class Sem01_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fib(scanner.nextInt()) = " + fib(scanner.nextInt()));
    }

    /**
     * @param n член последовательности Фибоначчи
     * @return значение
     * @apiNote алгоритм поиска нужного числа последовательности Фибоначчи.
     */
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
