import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index=sc.nextInt();
        int result=fibonacci(index);
        pln(result);
    }

    static int fibonacci(int index) {
        switch (index){
            case 0:
            case 1:
                return index;
            default:
                return fibonacci(index-1) + fibonacci(index-2);
        }
    }
    static void pln(int a){
        System.out.println(a);
    }
}
