package LevelOne.lectFour.StringsLectures;

public class _2_strCompression {
    public static void main(String[] args) {
        String str = "aaabbccdee";

        String retStr = "";

        char currChar = str.charAt(0);
        int currLen = 1;
        int i = 1;
        int n = str.length();
        while (i <= n-1) {
            if (str.charAt(i) == currChar) {
                currLen++;
            } else {
                retStr += currChar;
                if (currLen > 1) {
                    retStr += currLen;
                }

                currChar = str.charAt(i);
                currLen = 1;
            }
            i++;
        }
        retStr += currChar;
        if (currLen > 1) {
            retStr += currLen;
        }

        System.out.println(retStr);



    }
}
