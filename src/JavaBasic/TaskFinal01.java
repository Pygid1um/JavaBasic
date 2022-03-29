package JavaBasic;

import java.util.Locale;
import java.util.Scanner;

public class TaskFinal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        System.out.print("Введите текущий курс доллара: ");
        double dol = sc.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rub = sc.nextDouble();
        double result = rub / dol;

        System.out.printf("Итого: " + "%.2f", result);
        System.out.println(" долларов");
    }
}