package Sem01_Algorythm;

import java.util.Scanner;

public class Sem01_2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sum = sumIncrement(sum, n);
        System.out.println("sum = " + sum);
    }
    /**
     * @apiNote алгоритм, считающий сумму всех чисел от 1 до N.
     * @param sum переменная для подсчета
     * @param n до какого числа считаем
     * @return сумма
     */
    private static int sumIncrement(int sum, int n) {
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}

//ctrl+alt+l
