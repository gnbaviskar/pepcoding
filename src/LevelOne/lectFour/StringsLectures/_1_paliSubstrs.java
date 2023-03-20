package LevelOne.lectFour.StringsLectures;

public class _1_paliSubstrs {
    public static void main(String[] args) {
        String str = "abccbc";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+"\t");
            }
            System.out.println();
        }
    }
}
