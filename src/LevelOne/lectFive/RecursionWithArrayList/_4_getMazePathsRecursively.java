package LevelOne.lectFive.RecursionWithArrayList;

import java.util.ArrayList;

public class _4_getMazePathsRecursively {
    public static void main(String[] args) {
        System.out.println(getMazePaths(1,1,5,5));
    }

//System.out.println(getMazePaths(1,1,3,3)); // calling it
    public static ArrayList<String> getMazePaths(int startRow, int startCol, int destRow, int destCol) {
        if (startRow == destRow && startCol == destCol) { // if reached to destn
            ArrayList<String> returnArrList = new ArrayList<String>();
            returnArrList.add("");
            return  returnArrList;
        }
        ArrayList<String> hPaths = new ArrayList<String>();
        ArrayList<String> vPaths = new ArrayList<String>();
        if (startCol < destCol) { // no call if already at last col
            hPaths = getMazePaths(startRow, startCol+1, destRow, destCol);
        }
        if (startRow < destRow) { // no call if already at last row
            vPaths = getMazePaths(startRow+1, startCol, destRow, destCol);
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (String path: hPaths) {
            ans.add("h"+path);
        }
        for (String path: vPaths) {
            ans.add("v"+path);
        }
        return ans;
    }
}
