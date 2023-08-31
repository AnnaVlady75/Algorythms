package Lections;

import java.util.ArrayList;
import java.util.List;
//линейная функция O(n)
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> avalableDivider=findAvalableDivider(12);
        for (Integer integer: avalableDivider){
            System.out.println(integer);
        }
    }
    public static List<Integer> findAvalableDivider(int number){
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=number;i++){
            if(number%i ==0){
                result.add(i);
            }
        }
        return result;
    }

}
