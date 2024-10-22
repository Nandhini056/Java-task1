public class Main {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == 1 || rows == i) {
                    System.out.print(rows - (i - 1));
                } else if (i == j) {
                    System.out.print(rows - (i - 1));
                } else {
                    System.out.print(rows - (i - 1) - (j - 1));
                }
            }
            System.out.println();
        }
    }
}