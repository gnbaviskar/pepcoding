package LevelOne.lectFive.RecursionIntro;

public class _2_printIncreasing {
    public static void main(String[] args) {
        printNum(10, 1);
    }

    public  static void printNum(int num, int iterator) {
        if (iterator > num) return;

        System.out.println(iterator);
        printNum(num, iterator+1);

    }
}
