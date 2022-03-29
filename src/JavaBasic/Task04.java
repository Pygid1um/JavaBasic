package JavaBasic;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 3 числа: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        Double avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + avg);

        avg = avg / 2;
        double abc = Math.floor(avg);
        System.out.println(abc);

        if(abc > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}