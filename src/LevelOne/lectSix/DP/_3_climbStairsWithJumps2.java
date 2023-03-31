package LevelOne.lectSix.DP;

public class _3_climbStairsWithJumps2 {
    public static void main(String[] args) {

        int jumpArr[] = new int[]{2, 4, 1, 0, 2, 3};
        int n = 6;
        int paths = countPaths(jumpArr, 0, n);
        System.out.println(paths);
    }

    public static int countPaths(int[] arr, int index, int len) {
        if (index == len) {
            return 1;
        }
        int count = 0;
        System.out.println("hello world");
        for (int jump = 1; jump <= arr[index]; jump++) {
            if ((jump + index) <= len) {
                count += countPaths(arr, jump + index, len);
            } else {
                break;
            }
        }
        return count;
    }
}
