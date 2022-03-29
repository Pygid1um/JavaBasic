package JavaBasic;

public class Task14 {
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 20);
        }

        int min = array[0];
        for (int i = 1; i < 15; i++) {

            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное значение: " + min);

        int max = array[0];
        for (int i = 1; i < 15; i++) {

            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Максимальное значение: " + max);

        int moduleMin = Math.abs(min);
        int result = Math.max(max, moduleMin);
        System.out.println("Наибольшее по модулю: " + result);
    }
}