package LevelOne.lectSeven;

public class _13_sortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        partion(arr);
        displayArr(arr);
    }

    public static void partion(int[] arr) {
        int i = 0, j = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }
}
