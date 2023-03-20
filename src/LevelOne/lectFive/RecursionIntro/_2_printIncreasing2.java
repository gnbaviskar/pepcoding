package LevelOne.lectFive.RecursionIntro;

public class _2_printIncreasing2 {
    public static void main(String[] args) {
        printNum(10);
    }

    public static  void printNum(int num) {
        if (num == 0) return;

        printNum(num-1);
        System.out.println(num);
    }
}
