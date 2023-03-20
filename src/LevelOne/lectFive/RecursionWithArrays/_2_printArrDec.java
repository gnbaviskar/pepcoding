package LevelOne.lectFive.RecursionWithArrays;

public class _2_printArrDec {
    public static void main(String[] args) {
        int[] A = new int[]{10,20,30,40,50};
        displayArrDec(A, A.length-1);

    }

    public  static void displayArrDec(int A[], int index) {
        if (index < 0) return;
        System.out.println(A[index]);
        displayArrDec(A, index-1);
    }
}
