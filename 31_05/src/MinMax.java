import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        String[] s2 = s.split(",");
        int[] num = new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            num[i]=Integer.parseInt(s2[i]);
        }
        return num;
    }

    static void computeMinAndMax(int[] values) {
        int min=values[0], max=0;
        for (int x: values) {
            if(x<=min) min=x;
            if (x>=max) max=x;
        }
        System.out.println(min+","+max);
    }
}
