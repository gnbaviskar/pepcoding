package LevelOne.lectFive.RecursionWithArrayList;

import java.util.ArrayList;

public class _1_strSubstringsRecursively {
    public static void main(String[] args) {


        ArrayList<String> ans = getSubStr("abcdef");
        System.out.println(ans);
    }

    public static ArrayList< String> getSubStr(String str) {
        if (str.length() == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        char ch = str.charAt(0);

        String remainings = str.substring(1);
        ArrayList<String> rres = getSubStr(remainings);
        ArrayList<String> mres = new ArrayList<>();
        for (String val : rres) {
            mres.add("" + val);
        }

        for (String val : rres) {
            mres.add(ch + val);
        }
        return mres;
    }
}
