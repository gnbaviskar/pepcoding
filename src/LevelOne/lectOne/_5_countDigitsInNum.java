package LevelOne.lectOne;

public class _5_countDigitsInNum {
    public static void main(String[] args) {
        int n = 65784383;
        int c = 0;
        while (n > 0) {
            c++;
            // if we divide 9543/10 => 954, if modulo 9543%10 => 3
            n = n / 10;
        }
        System.out.println(c);
    }
}
