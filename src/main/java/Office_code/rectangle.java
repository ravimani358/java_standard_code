package Office_code;

public class rectangle {

    public static void main(String[] args) {
        int size = 5; // size of the square

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                }
                else {
                	System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}