package LevelOne.lectOne;

// My try: almost failed to solve this without using Array, Easy to solve using array
// Issue with approach: suppose need to rotate 02540 by 2, it should be 40025, but seems failing, Instead this approach where we need to get power of 0 which is not doable at this time. we should cut the number by division and add using multiplication. check next file for the same

public class _9_rotateNum {
    public static void main(String[] args) {
        int A = 02540;
        int k = 2;

        int digiCounts = 0;
        int temp = A;
        while (temp > 0) {
            digiCounts++;
            temp = temp / 10;
        }

        int index = 0;
        k = k % digiCounts;
        int ans = 0;
        temp = A;

        while (index < digiCounts) {
            int digit = temp % 10;
            int toIndex = (index + k) % digiCounts;
            ans = ans + (digit * (int) Math.pow(10, toIndex));
            index++;
            temp = temp / 10;
        }
        System.out.println(ans);

    }
}
