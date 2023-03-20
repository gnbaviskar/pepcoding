package LevelOne.lectFour.StringsLectures;

public class _5_diffEveryTwoConsecutives {
    public static void main(String[] args) {
        StringBuilder inputStr = new StringBuilder("abecd");
        StringBuilder returnStr = new StringBuilder();

        returnStr.append(inputStr.charAt(0));
        int start = 0; int end = 1;
        while (end <= (inputStr.length() - 1)) {
            int diff = inputStr.charAt(end) - inputStr.charAt(start);
            returnStr.append(diff);
            returnStr.append(inputStr.charAt(end));
            start++;
            end++;
        }
        System.out.println(returnStr.toString());


    }
}
