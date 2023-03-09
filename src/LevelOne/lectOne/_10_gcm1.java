package LevelOne.lectOne;

public class _10_gcm1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 24;
        // swap to make A smaller than B
        if (A>B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int index = 1;
        int gcm = 1;
        while ((index * index) <= A) {
            if ((A % index) == 0) {
                int fact1 = index;
                int fact2 = A / index;
                if ((B % fact2) == 0 && fact2 > gcm) {
                    gcm = fact2;
                    break;
                } else if ((B % fact1) == 0 && fact1 > gcm) gcm = fact1;

            }
            index++;
        }
        System.out.println(gcm);
    }
}
