package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _9_printSubArrays {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 1, 2, 0};
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }

        }


    }
}
