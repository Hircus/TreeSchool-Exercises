public class NumeriPerfetti {
    public static void main(String[] args){
        for (int i = 1; i < 1000; i++) {
            if(recPerfect(i, 1,0)) System.out.println(i);
        }
    }
    public static boolean perfect(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0) sum+=i;
        }
        return sum==n;
    }

    public static boolean recPerfect(int n, int value, int sum){
        if(value==n) return sum == n;
        else if(n%value==0) return recPerfect(n, value + 1, sum+value);
        else return recPerfect(n, value + 1, sum);
    }
}
