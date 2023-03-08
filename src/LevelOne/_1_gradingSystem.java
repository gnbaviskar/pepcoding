package LevelOne;

public class _1_gradingSystem {
    public static void main(String[] args) {
//        // binary to decimal
//        int A = 1111101;
//        int base = 2;

        // octal to decimal
        int A = 1172;
        int base = 8;

        

        int ans = 0, t = 1;
        while (A>0) {
            int digit = A % 10;
            ans  += digit * t;
            t = t * base;
            A = A / 10;
        }
        System.out.println(ans);
    }
}
