package LevelOne.lectNine.stacks;

public class _13_smallestpattern {
    public static void main(String[] args) {
        System.out.println(smalledPattern("ddiididd"));
    }

    public static String smalledPattern(String exp) {
        int i = 0; int max = 0; String ans = "";
        int n = exp.length();
        while (i < n) {
            int ds = 0, is = 0;
            int tempI = i;
            while (exp.charAt(i) == exp.charAt(tempI)) {
                tempI++;
            }
            if (exp.charAt(i) == 'd') {
                int len = tempI - i + 1;
                int tempMax = max+len;
                while (tempMax > max) {
                    ans = ans + tempMax;
                    tempMax--;
                }
                max = max+len;
                i = tempI;
            } else {
                int len = tempI-i;
                if (len > 1) {
                    int tempMax = max+ len -1;
                    int j = max+1;
                    while (j <= tempMax) {
                        ans += j;
                        j++;
                    }
                    max = ans.charAt(ans.length()-1) - '0';
                    i = tempI;

                    System.out.println("");
                }
            }
            System.out.println("s");
        }

        return "";
    }
}
