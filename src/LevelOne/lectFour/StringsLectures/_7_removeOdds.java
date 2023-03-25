package LevelOne.lectFour.StringsLectures;

import java.util.ArrayList;

public class _7_removeOdds {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        int counter = 1;
        for (int i = 0; i<=10; i++) {
            A.add(counter); counter++;
        }

        System.out.println(A);

        int i = 0;
        while (i < A.size()) {
            int val = A.get(i);
            if ((val&1)==1) {
                A.remove(i);
            }
            else {
                i++;
            }
        }

        System.out.println(A);


    }
}
