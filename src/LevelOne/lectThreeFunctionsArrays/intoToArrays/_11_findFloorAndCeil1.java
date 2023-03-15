package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _11_findFloorAndCeil1 {
    public static void main(String[] args) {
        int[] A = new int[]{2,5,10,15,22,33,40,42,55,66};
        int n = A.length;

        int ele =  68;
        int l = 0, h = n-1;
        int floor = -1, ceil = -1;
        while (l <= h) {
            int mid = (l+h) / 2;
           if (A[mid] < ele) {
               l = mid + 1;
               floor = mid;
           } else if (A[mid] > ele) {
               h = mid - 1;
               ceil = mid;
           } else {
               floor = mid;
               ceil = mid;
               break;
           }
        }
        // 788086f6bf6d296a751711228a7444d1

        System.out.println("floor\t"+A[floor]+"\tceil\t"+A[ceil]);
    }
}
