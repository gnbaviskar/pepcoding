package LevelOne.lectFive.RecursionWithArrays;

public class _5_firstOcc {
    public static void main(String[] args) {
        int[] A = new int[] {2, 3, 4, 3, 2};
        int val = getFirstOcc(A, 3, 0);
        System.out.println(val);
    }

    public  static int getFirstOcc(int A[],int ele, int index) {
        if (index > (A.length - 1)) return -1;
        if (A[index] == ele) return index;
        return getFirstOcc(A, ele, index+1);
    }
}
