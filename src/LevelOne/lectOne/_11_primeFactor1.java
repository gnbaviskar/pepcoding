package LevelOne.lectOne;

public class _11_primeFactor1 {
    public static void main(String[] args) {
        int A = 1440;
        int divisor = 2;
        int temp = A;
        while ((divisor * divisor) <= temp) {
            if ((temp % divisor) != 0) {
                while ((temp%divisor)!=0) {
                    divisor++;
                }
            }

            System.out.print(divisor+" ");
            temp = temp / divisor;
        }
        if (temp != 1) {
            System.out.print(divisor+" ");
        }
    }
}
