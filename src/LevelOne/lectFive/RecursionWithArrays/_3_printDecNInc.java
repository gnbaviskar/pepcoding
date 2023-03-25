package LevelOne.lectFive.RecursionWithArrays;

public class _3_printDecNInc {
    public static void main(String[] args) {
        int[] A = new int[]{10,20,30,40,50};

        printDecInc(A, A.length - 1);
    }

    public static void printDecInc(int[] A, int index) {
        if (index < 0) {
            System.out.println("");
            return;
        }

        System.out.println(A[index]);
        printDecInc(A, index - 1);
        System.out.println(A[index]);
    }
}
