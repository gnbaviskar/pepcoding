package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _13_subsetArr1 {
    public static void main(String[] args) {
        int n = 5;

        int[] A = new int[]{10, 20, 30, 40, 50};
        int index = 0;
//        while (index < (n*n)) {
        int limit = (int) Math.pow(2, n);
        while(index < limit) {
            int setBits = 0;
            for (int j = n-1; j >= 0; j--) {
                int bit = (index >> j) & 1;
                if (bit > 0) {
                    int jPrint = n-j-1;
                    System.out.print(A[jPrint]+"\t");
                    setBits++;
                } else {
                    System.out.print("-\t");
                }
                int lo = 1;
            }
            System.out.println("index: "+index);
            index++;
            System.out.println();
            if (setBits == n) break;
        }
    }
}
