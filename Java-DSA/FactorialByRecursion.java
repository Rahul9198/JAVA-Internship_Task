public class FactorialByRecursion {
    int fact = 1;

    public static void main(String[] args) {
        int n = 5;
        FactorialByRecursion obj = new FactorialByRecursion();
        obj.factorial(n);
        System.out.println(obj.fact);
    }

    public void factorial(int n) {
        if (n == 0) {
            return;
        }
        factorial(n - 1);
        fact = fact * n;
    }
    
}
