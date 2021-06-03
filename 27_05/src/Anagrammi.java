import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrammi {
    public static void main(String[] args) {
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();**/
        String a = "adriano";
        String b = "adranoi";
        System.out.print(anagram(a, b));

    }
    //Date due stringhe in input, definire se una è l'anagramma dell'altra

    static boolean anagram(String a, String b) {
        boolean f = false;

        if(a.length()==b.length()){
            for (char x:a.toCharArray()){
                int c = countOccurrences(x, a);
                int c1 = countOccurrences(x, b);
                if (c==c1) f = true;
            }
        }
        return f;
    }

    static int countOccurrences(char a, String b) {
        int c = 0;
        for(int i = 0; i<b.length(); i++){
            if(b.charAt(i) == a) c++;
        }
        return c;
    }
}