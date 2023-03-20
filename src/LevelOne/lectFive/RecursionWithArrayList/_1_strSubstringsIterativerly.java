package LevelOne.lectFive.RecursionWithArrayList;

public class _1_strSubstringsIterativerly {
    public static void main(String[] args) {
        StringBuilder inputSb = new StringBuilder("abcdef");
        int n = inputSb.length();
        int limit = (int)Math.pow(2, n);

        for (int i = 0; i < limit; i++) {
            for (int j = n-1; j >= 0; j--) {
                int bit = i>>j;
                if ((bit&1)==1) {
                    System.out.print(inputSb.charAt(j)+"\t");
                } else {
                    System.out.print("_\t");
                }
            }
            System.out.println();
        }
    }
}
