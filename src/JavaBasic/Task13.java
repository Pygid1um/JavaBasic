package JavaBasic;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите предложение:");
        String str = scan.nextLine();
       // String str = "I love java 8 Я люблю java 14 core1";
        String[] ar = str.split(" ");
        boolean check = false;
        int counter = 0;

        System.out.println("Вывод только латинских слов:");
        for (int i = 0; i < ar.length; i++) {
            char[] chararray = ar[i].toCharArray();
            for (int j = 0; j < chararray.length; j++) {
                if (Character.UnicodeBlock.of(chararray[j]).equals(Character.UnicodeBlock.BASIC_LATIN) == true & Character.isDigit(chararray[j]) == false) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }

            if (check == true) {
                counter++;
                System.out.println(ar[i]);
            }
        }
        System.out.println("Количество латинсков слов в предложении: " + counter);
    }
}