package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _12_firstAndLastIndexEle {
    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 10, 15, 22, 33, 33, 33, 33, 33, 40, 42, 55, 66, 77};
        int n = A.length;
        int data = 33;
        int low = 0, high = n-1;
        int first = -1, last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midNum = A[mid];
            if (midNum > data) {
                low = low + 1;
            } else if (midNum < data) {
                high = high - 1;
            } else {
                // mid is the datament to be founf
                System.out.println("found at: "+mid);
                first = mid;
                if (first > 0) {
                    while (A[first] == data) {
                        if (first == 0) break;
                        first--;
                    }
                    ;
                }
                first++;
                System.out.println("first changed to: "+first);


                last = first;
                while (A[last] == data) {
                    if (last == (n-1)) break;
                    last++;
                }
                last--;
                System.out.println("last changed to: "+last);
                return;
            }
        }
        System.out.println("not found");
    }
}
