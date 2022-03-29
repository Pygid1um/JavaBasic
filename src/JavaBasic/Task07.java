package JavaBasic;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 5;
        int y = 17;
        int z = 9;

        System.out.print("Введите размер массива: ");
        int a = scan.nextInt();
        int b;
        int[] ar = new int[a];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Введите значение: ");
            b = scan.nextInt();
            ar[i] = b;
            if( ar[i] == x || ar[i] == y || ar[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}