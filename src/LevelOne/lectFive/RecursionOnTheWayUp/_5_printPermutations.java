package LevelOne.lectFive.RecursionOnTheWayUp;

public class _5_printPermutations {
    public static void main(String[] args) {
        printP("abc", "");
    }
    //printP("abc", "");
    static public void printP(String remains, String ans) {
        int n = remains.length();
        if (n == 0) {
            System.out.print(ans+"\t");
            return;
        }

        for (int i = 0; i < n; i++) {
            String temp = "";
            if (i==0) {
                temp = remains.substring(i+1);
            } else if (i == (n - 1)) {
                temp = remains.substring(0, n - 1);
            } else {
                temp = remains.substring(0, i) + remains.substring(i+1, n);
            }
//            System.out.println(temp+"  "+remains.charAt(i));
            printP(temp, ans+remains.charAt(i));
        }
    }
}
