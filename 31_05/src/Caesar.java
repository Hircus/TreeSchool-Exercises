import java.util.Arrays;
import java.util.Random;

public class Caesar {
    public static void main(String[] args){
        Random r = new Random();
        cifrary("wxyz", 3);
    }
    public static void cifrary(String word, int key){
        char[] array = word.toCharArray();
        int[] parsed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            parsed[i] = array[i];
            parsed[i] += key;
            switch (parsed[i]) {
                case 123 -> array[i] = 'a';
                case 124 -> array[i] = 'b';
                case 125 -> array[i] = 'c';
                default -> array[i] = (char) parsed[i];
            }
        }
        String str = new String(array);
        System.out.println(str);
    }
}
