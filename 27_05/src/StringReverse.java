import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        String s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }


}