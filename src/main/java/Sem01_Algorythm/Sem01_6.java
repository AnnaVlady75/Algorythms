package Sem01_Algorythm;

import java.util.Date;

public class Sem01_6 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i += 10) {
            System.out.println("\n \n текущий шаг = " + i + " \n ====================== \n ");
            Date startDate = new Date();
            Sem01_4.fib(i);
            Date endDate = new Date();
            long recursDuration = endDate.getTime() - startDate.getTime();
            System.out.println("recursDuration = " + recursDuration);
            Date startDateLin = new Date();
            Sem01_5.fib(i);
            Date endDateLin = new Date();
            long linDuration = endDateLin.getTime() - startDateLin.getTime();
            System.out.println("linDuration = " + linDuration);
        }
    }
}
