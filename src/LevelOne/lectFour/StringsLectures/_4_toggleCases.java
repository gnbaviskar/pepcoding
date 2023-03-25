package LevelOne.lectFour.StringsLectures;

public class _4_toggleCases {
    public static void main(String[] args) {
        String str = "PEPcodINg";
        StringBuilder returnStr = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char charat = str.charAt(i);
            if (charat <= 90) {
                // make it lower case
                returnStr.append((char)(charat + 32));
            } else {
                returnStr.append((char)(charat - 32));
            }
        }
        System.out.println(returnStr.toString());

    }
}
