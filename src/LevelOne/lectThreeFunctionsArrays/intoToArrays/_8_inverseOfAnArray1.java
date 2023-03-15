package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _8_inverseOfAnArray1 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 1, 2, 0};
        int n = arr.length;
        int[] opp = new int[n];

        for (int i = 0; i < n; i++) {
//            int digit = arr[i];
            opp[arr[i]] = i;
        }

        for (int i = 0; i < opp.length; i++) {
            System.out.print(opp[i]+"\t");
        }


    }
}
