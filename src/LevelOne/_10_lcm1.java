package LevelOne;

public class _10_lcm1 {
    public static void main(String[] args) {
        int A = 17;
        int B = 13;
        // swap to make A smaller than B
        if (A>B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int lcm = Integer.MAX_VALUE;
        boolean isFound = false;
        int index = 1;
        while (!isFound) {
            int multiple = A * index;
            if ((multiple > B) && (multiple%B == 0)) {
                lcm = multiple;
                isFound = true;
                break;
            }
            index++;
        }
        System.out.println(lcm);
    }
}
