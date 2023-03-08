package LevelOne;

public class _4_printAllFibNums {
    // solving fib using iterative method
    public static void main(String[] args) {
        int A = 8;

        if (A==0) System.out.println(0);
        if (A<=2) System.out.println(1);


        int n1 = 0;
        int n2 = 1;
        int fib = 1;
        for (int i = 3; i <= A; i++) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }
        System.out.println("fib for "+A+" is "+fib);
    }
}
