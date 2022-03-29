package JavaBasic;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - расстояние, 2 - масса");
        int x = scan.nextInt();

        if (x == 1) { //выбрали расстояние
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int y = scan.nextInt();
            System.out.println("Введите число:");
            int z = scan.nextInt();

            if (y == 1) { //если выбрали метры
                System.out.println("Результат:");
                System.out.println("Метры: " + z);
                double v = z * 0.0006;
                System.out.printf("Мили: " + "%.4f", v);
                System.out.println();
                double v1 = z * 1.0936;
                System.out.printf("Ярды: " + "%.4f", v1);
                System.out.println();
                double v2 = z * 3.2808;
                System.out.printf("Футы: " + "%.4f", v2);
            } else if (y == 2) { // если выбрали мили
                System.out.println("Результат:");
                System.out.println("Мили: " + z);
                double v3 = z * 1609.344;
                System.out.printf("Метры: " + "%.3f", v3);
                System.out.println();
                double v4 = z * 1759.999;
                System.out.printf("Ярды: " + "%.3f", v4);
                System.out.println();
                System.out.println("Футы: " + (z * 5280));
            } else if (y == 3) { //если выбрали ярды
                System.out.println("Результат:");
                System.out.println("Ярды: " + z);
                double v5 = z * 0.9144;
                System.out.printf("Метры: " + "%.4f", v5);
                System.out.println();
                double v6 = z * 0.0005;
                System.out.printf("Мили: " + "%.4f", v6);
                System.out.println();
                System.out.println("Футы: " + (z * 3));
            } else if (y == 4) { //если выбрали футы
                System.out.println("Результат:");
                System.out.println("Футы: " + z);
                double v7 = z * 0.3048;
                System.out.printf("Метры: " + "%.4f", v7);
                System.out.println();
                double v8 = z * 0.00018;
                System.out.printf("Мили: " + "%.5f", v8);
                System.out.println();
                double v9 = z * 0.333;
                System.out.printf("Ярды: " + "%.3f", v9);
            }
        }
        if (x == 2) { //выбрали массу
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - тонна, 4 - унция");
            int a = scan.nextInt();
            System.out.println("Введите число:");
            int b = scan.nextInt();

            if (a == 1) { //если выбрали килограммы
                System.out.println("Результат:");
                System.out.println("Килограмм: " + b);
                System.out.println("Грамм: " + (b * 1000));
                double v10 = b * 0.001;
                System.out.printf("Тонна: " + "%.3f", v10);
                System.out.println();
                double v11 = b * 35.2;
                System.out.printf("Унция: " + "%.1f", v11);
            } else if (a == 2) { //если выбрали граммы
                System.out.println("Результат:");
                System.out.println("Грамм: " + b);
                double v12 = b * 0.001;
                System.out.printf("Килорамм: " + "%.3f", v12);
                System.out.println();
                double v13 = b * 0.000001;
                System.out.printf("Тонна: " + "%.6f", v13);
                System.out.println();
                double v14 = b * 0.035;
                System.out.printf("Унция: " + "%.3f", v14);
            } else if (a == 3) { //если выбрали тонны
                System.out.println("Результат:");
                System.out.println("Тонна: " + b);
                System.out.println("Килограмм: " + (b * 1000));
                System.out.println("Грамм: " + (b * 1000000));
                double v15 = b * 35273.9;
                System.out.printf("Унция: " + "%.1f", v15);
            } else if (a == 4) { //если выбрали унции
                System.out.println("Результат:");
                System.out.println("Унция: " + b);
                double v16 = b * 28.349;
                System.out.printf("Грамм: " + "%.3f", v16);
                System.out.println();
                double v17 = b * 0.028;
                System.out.printf("Килограмм: " + "%.3f", v17);
                System.out.println();
                double v18 = b * 0.000028;
                System.out.printf("Тонна: " + "%.6f", v18);

            }
        }
    }
}