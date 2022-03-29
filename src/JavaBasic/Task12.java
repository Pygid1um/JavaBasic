package JavaBasic;

public class Task12 {
    public static void main(String[] args){
        String str = "I like Java!!!";

        if(str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
               System.out.println(str.toUpperCase());
            }

        String sub = str.substring(7, 11);
        String rep = sub.replace('a', 'o');
        System.out.println(rep);
    }
}