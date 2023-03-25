package LevelOne.lectFive.RecursionOnTheWayUp;

public class _1_printSubSequence {
    public static void main(String[] args) {
        printSubSeq("abc", "");
    }
//    printSubSeq("abc", "");
    public static void printSubSeq(String queStr, String ans) {
        if (queStr.length() == 0) { // when queStr is empty, all str is passed to ans, que="", ans=abc
            System.out.println(ans);
            return;
        }
        String ch = String.valueOf(queStr.charAt(0)); // get first chat
        String remaining = queStr.substring(1); // remaking str
        printSubSeq(remaining, ans+""); // failure call, when we have "" of abc
        printSubSeq(remaining, ans+ch); // successful call, when we a out of abc
    }
}
