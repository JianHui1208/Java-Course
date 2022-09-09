package Resursion;
public class Test {
    public static void main(String[] args) {
        int A = sum(10,0);
        int B = sum(10);
        System.out.println(A);
        System.out.println(B);
    }
    public static int sum(int n, int total){
        if(n == 0)
            return total;
        else
            return sum(n - 1, total + n);
    }
    
    public static int sum(int n){
        if(n < 0)
            throw new IllegalArgumentException("N should be >= 0");
        else if(n == 0)
            return 0;
        else
            return sum(n - 1) + n;
    }
}
