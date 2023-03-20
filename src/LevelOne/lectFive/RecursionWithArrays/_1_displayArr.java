package LevelOne.lectFive.RecursionWithArrays;

public class _1_displayArr {
    public static void main(String[] args) {
        int[] A = new int[]{10,20,30,40,50};

        displayArrInc(A, 0);
    }

    public static void displayArrInc(int[] A, int index) {
        if (index >= A.length) return;

        System.out.println(A[index]);
        displayArrInc(A, index+1);
    }
}
