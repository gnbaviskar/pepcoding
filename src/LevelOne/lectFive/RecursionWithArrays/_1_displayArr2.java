package LevelOne.lectFive.RecursionWithArrays;

public class _1_displayArr2 {
    public static void main(String[] args) {
        int[] A = new int[]{10,20,30,40,50};

        displayArrInc(A, A.length - 1);
    }

    public static void displayArrInc(int[] A, int index) {
        if (index < 0) return;


        displayArrInc(A, index-1);
        System.out.println(A[index]);
    }
}
