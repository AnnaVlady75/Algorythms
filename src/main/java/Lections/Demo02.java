package Lections;

import java.util.ArrayList;
import java.util.List;

//Квадратичная функция O(n^2)
public class Demo02 {
    public static void main(String[] args) {
        List<Integer> simpleNumbers = findSimpleNumbers(6);
//        for (Integer integer: simpleNumbers){
//            System.out.println(integer);
//        }
    }

    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                res.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return res;
    }
}


