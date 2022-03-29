package JavaBasic;

import java.util.Locale;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        System.out.print("Введите размер массива: ");
        int a = scan.nextInt();
        double b;
        double c = 0;
        double[] ar = new double[a];

        for (int i = 0; i < ar.length; i++) {
            System.out.print("Введите значение: ");
            b = scan.nextDouble();
            ar[i] = b;
            c = c + b;
        }

        c = c / a;

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] * c);
        }
    }
}