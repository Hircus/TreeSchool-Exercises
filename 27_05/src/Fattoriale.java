public class Fattoriale {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
        System.out.println(factorial(20));
    }

    private static long factorial(int n) {
        if(n==0 || n==1) return 1;
        int f = 1;
        for(int i=n; i>1; i--){
            f = i*f;
        }
        return f;
    }
}
