package Sem01_Algorythm;

import java.util.Scanner;

public class Sem01_1 {
    public static void main(String[] args) {
        //Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}

//ctrl+alt+m  /**  вынос в отдельный метод выделенного фрагмента
