package Lesson1;

import java.util.Scanner;

public class AutoGenerated {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double FuilPrice = 52.5; // Ціна за літр палива
        double FuilR = 8.8;     //розхід на 100км
        int r;           // відстань яку проїхав автомобіль
        double sum;

        System.out.println(" Enter the distance");
        r = sc.nextInt();

        sum = FuilR / 100 * FuilPrice * r ;

        System.out.println("Total sum = " + sum + "UAH");


    }
}
