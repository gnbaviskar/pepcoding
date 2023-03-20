package LevelOne.lectFive.RecursionWithArrayList;

import java.util.ArrayList;

public class _2_getKbc {
    public static void main(String[] args) {
        String[] myList = new String[] {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

        System.out.println(getKbc("573", myList));
    }

    public  static ArrayList<String> getKbc(String numStr, String[] myList) {
        if (numStr.length() == 0) {
            ArrayList<String> emptyRes = new ArrayList<String>();
            emptyRes.add(""); // [] and [""] are different, we need [""]
            return emptyRes;
        }

        char ch = numStr.charAt(0); // '5' char is given by int 53, we need 5 so 53 - 48 ('0') => 5
        // remaing str
        String remStr = numStr.substring(1);
        // recursion
        ArrayList<String> recRes = getKbc(remStr, myList);
        // return res
        ArrayList<String> myRes = new ArrayList<>();

        String charsAtZero = myList[ch - '0'];

        for (int i = 0; i < charsAtZero.length(); i++) {
            char toBeAttached = charsAtZero.charAt(i);
            for (String rstr: recRes) {
                myRes.add(toBeAttached+rstr);
            }
        }
        return myRes;

    }
}
