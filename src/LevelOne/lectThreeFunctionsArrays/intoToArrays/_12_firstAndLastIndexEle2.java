package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _12_firstAndLastIndexEle2 {
    // code to get last index of occurrence
    public static void main(String[] args) {
        int[] A = new int[] {10, 10, 10, 20, 20, 20, 20, 30, 40, 40};
        int n = A.length;
        int data = 30;
        int low = 0, high = n-1, lastIndex = -1;
        while (low <= high) {
            int mid = (low+high)/2;

            if (A[mid] < data) {
                low = mid + 1;
            } else if (A[mid] > data) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                // mid is the data
                low = mid + 1;
            }
        }
        System.out.println("last index: "+lastIndex);
    }
}
