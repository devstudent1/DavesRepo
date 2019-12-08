package HeadFirstJavaExercises;

public class PoolPuzzle {

    public static void main(String[] args) {
        int x = 0;

        while (x < 4) {
            System.out.print(" ");
            if (x < 1) {
                System.out.print("a");
            }
        }
        if (x > 1){
            System.out.print("n");
            x = x + 2;
        }
        if (x == 1){
            System.out.print("oise");
        }
    }
}
