package LevelOne;

public class _12_benjaminPuzzle1 {
    public static void main(String[] args) {
        int A = 20;
        int index = 1;

        while ((index * index) < A) {
            System.out.println(index*index);
            index++;
        }
    }
}
