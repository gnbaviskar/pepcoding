package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _7_revArray1 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5};
        int k = -3;
        int n = a.length;
        k = k % n;

        if (k < 0) {
            k = n + k;  // if K is already negative
        }

        reverseArr(a, 0, n-1);
        reverseArr(a, 0, k-1);
        reverseArr(a, k, n-1);
        printArray(a);

    }

    public  static  void  printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    public static void reverseArr (int []a, int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
