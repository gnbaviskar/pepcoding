package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _12_firstAndLastIndexEle3 {
    public static void main(String[] args) {
        int[] A = new int[] {10, 10, 10, 20, 20, 20, 20, 30, 40, 40};
        int n = A.length;
        int data = 20;
        int low = 0, high = n-1, firstIndex = -1;
        while (low <= high) {
            int mid = (low+high)/2;

            if (A[mid] < data) {
                low = mid + 1;
            } else if (A[mid] > data) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                // mid is the data
//                low = mid + 1;
                high = high - 1;
            }

        }
        System.out.println("first index: "+firstIndex);
    }
}
