package LevelOne.lectFive.RecursionWithArrays;

public class _6_getLactOccIndex {
    public static void main(String[] args) {
        int[] A = new int[] {2, 3, 4, 3, 2};
        int val = getLastOccIndex(A, 3, A.length - 1);
        System.out.println(val);
    }

    public  static int getLastOccIndex (int[] A, int ele, int index) {
        if (index < 0) return -1;

        if (A[index] == ele) return  index;
        return  getLastOccIndex(A, ele, index - 1);
    }


}
