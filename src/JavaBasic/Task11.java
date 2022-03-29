package JavaBasic;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        String str = scan.nextLine();
        System.out.print("Введите второе число: ");
        int second = scan.nextInt();

        int first = Integer.parseInt(str);

        if(first > second) {
            System.out.println("Большее число: " + first);
            double d = second;
            System.out.println(d);
        }

        if(first < second) {
            System.out.println("Большее число: " + second);
            double d = first;
            System.out.println(d);
        }
    }
}