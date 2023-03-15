package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _10_binarySearchArr1 {
    public static void main(String[] args) {
        int[] A = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = A.length;
        int l = 0, h = n-1;
        int ele = 100;
        while (l <= h) {
            int mid = (l+h)/2;
            if (ele > A[mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

            if (A[mid] == ele) {
                System.out.println("found at index\t"+mid);
                return;
            }
        }
        System.out.println("not found!");
    }
}
