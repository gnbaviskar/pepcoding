package LevelOne.lectFive.RecursionWithArrays;

public class _4_getArrMax {
    public static void main(String[] args) {
        int[] A = new int[]{10,230,130,40,50};
        int val = getMaxIndex(A, A.length - 1, A.length - 1);
        System.out.println(val);
    }

    public  static int getMaxIndex(int[] A, int curMaxIndex, int index) {
        if (index < 0) return  curMaxIndex;

        if (A[index] > A[curMaxIndex]) curMaxIndex = index;

        return getMaxIndex(A, curMaxIndex, index - 1);
    }
}
