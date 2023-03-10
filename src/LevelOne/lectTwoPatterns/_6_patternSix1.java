package LevelOne.lectTwoPatterns;

public class _6_patternSix1 {
    public static void main(String[] args) {
        int A = 5;
       int blank = 1;
       boolean isMid = false;
       int stars = A / 2;
       for (int i = 0; i <= A-1; i++) {
           System.out.print("*\t");
           // print stars
           for (int j = 0; j < stars; j++) {
               System.out.print("*\t");
           }

           // print hollow
           for (int j = 0; j < blank; j++) {
               System.out.print("\t");
           }

           // print stars
           for (int j = 0; j < stars; j++) {
               System.out.print("*\t");
           }

           if (blank == A) isMid = true;

           if (!isMid) {
               stars--;
               blank += 2;
           } else {
               blank -= 2;
               stars++;
           }
           System.out.print("*\t");
           System.out.println();
       }

    }
}
