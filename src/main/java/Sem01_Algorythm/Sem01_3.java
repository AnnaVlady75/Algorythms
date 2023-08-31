package Sem01_Algorythm;

import java.util.Scanner;

public class Sem01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
        int count =0;
        for (int i1 = 1; i1 <=n ; i1++) {
            for (int i2 = 1; i2 < n; i2++) {
                for (int i3 = 1; i3 < n; i3++) {
                    for (int i4 = 1; i4 < n; i4++) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
