package JavaBasic;

import java.util.Scanner;


public class Task05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 2 числа и математический знак: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        String a = scan.next();

        if(a.equals("+")){
            int sum = x + y;
            System.out.println("Ответ: " + sum);
        }

        if (a.equals("-")){
            int min = x - y;
            System.out.println("Ответ: " + min);
        }

        if (a.equals("/")){
            int div = x / y;
            System.out.println("Ответ: " + div);
        }

        if (a.equals("*")){
            int mul = x * y;
            System.out.println("Ответ: " + mul);
        }
    }
}