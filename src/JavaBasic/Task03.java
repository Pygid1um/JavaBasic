package JavaBasic;

public class Task03 {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 8, 23, 3, 7};
        int last = arr[arr.length - 1];
        int temp = arr[0];
        arr[0] = last;
        arr[arr.length - 1] = temp;

        int sred = arr[arr.length / 2];
        int first = arr[0];
        System.out.println(sred + first);
    }
}