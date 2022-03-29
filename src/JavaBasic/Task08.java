package JavaBasic;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
    int n = scan.nextInt();
    int sum = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 != 0){
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}