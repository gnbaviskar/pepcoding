package LevelOne.lectFive.RecursionWithArrayList;

import java.util.ArrayList;

public class _5_getMazePathJumpsRec {
    // seems like some mistake
    public static void main(String[] args) {
        System.out.println(getMazePath(1,1,3,3));
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> ret = new ArrayList<>();
            ret.add("");
            return ret;
        }


        ArrayList<String> retPaths = new ArrayList<>();

        // horizontal moves
        for (int i = sc; i < dc; i++) {
            ArrayList<String> hpaths = getMazePath(sr, sc + i, dr, dc);
            for (String path: hpaths) {
                retPaths.add("h"+i+path);
            }
        }

        // vertical moves
        for (int i = sr; i < dr; i++) {
            ArrayList<String> vpaths = getMazePath(sr+1, sc, dr, dc);
            for (String path: vpaths) {
                retPaths.add("v"+i+path);
            }
        }

        for (int r = sr, c = sc; r < dr && c < dc; r++, c++) {
            ArrayList<String> dpaths = getMazePath(sr+r, sc+c, dr, dc);
            for (String path: dpaths) {
                retPaths.add("d"+r+path);
            }
        }

        return retPaths;
    }
}
