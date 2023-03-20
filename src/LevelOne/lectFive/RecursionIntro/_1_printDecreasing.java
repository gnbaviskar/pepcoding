package LevelOne.lectFive.RecursionIntro;

public class _1_printDecreasing {
    public static void main(String[] args) {
        printNum(10);
    }

    public static void printNum(int num) {
        if (num == 0) return;



        System.out.println(num);
        printNum(num-1);
    }
}
