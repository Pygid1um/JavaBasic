package JavaBasic;

import java.util.Scanner;

public class TaskFinal04 {
    public static void main(String[] args) {
        System.out.println("Загадка! Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        String otvet = "Заархивированный вирус";
        boolean podskazka = false;
        boolean bezPodskazki = false;
        String verno = null;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите ваш ответ: ");
            verno = scan.nextLine();

            switch (verno) {
                case("Заархивированный вирус"):
                    System.out.println("Правильно!");
                    podskazka = true;
                    break;

                default:
                    if (bezPodskazki) {
                        podskazka = true;
                        break;

                    }  if ((verno.equalsIgnoreCase("Подсказка")) && i == 0) {
                        System.out.println("Нечто спрятанное в папку и вредит компьютеру");
                        bezPodskazki = true;
                        break;

                    } else if (verno.equalsIgnoreCase("Подсказка") && i > 0) {
                        System.out.println("Извините, подсказка больше недоступна!");
                    } else if (i<2) {
                         System.out.println("Подумай еще!");
                }
            }
            if (podskazka){
                break;
            }
        }
        if (!(verno.equalsIgnoreCase(otvet))){
            System.out.println("Обидно! Приходи в другой раз");
        }
    }
}