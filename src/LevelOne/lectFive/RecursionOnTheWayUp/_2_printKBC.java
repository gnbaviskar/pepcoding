package LevelOne.lectFive.RecursionOnTheWayUp;

public class _2_printKBC {

    public static void main(String[] args) {
        printKBC("573", "");
    }

    static String[] myList = new String[] {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKBC(String num, String ans) {
        if (num.length() == 0) { // print when all chars in num, moved to ans
            System.out.print(ans+"\t");
            return;
        }
        char ch = num.charAt(0);
        String chars = myList[ch - '0']; // char as 5 denotes 53 in num, need to access 5th element from myList, 53 - 48(0) => 5
        String remNum = num.substring(1); // remaing num
        for (int i = 0; i < chars.length(); i++) {
            printKBC(remNum, ans+ chars.charAt(i)); // call combination at num chars
        }
    }
}
