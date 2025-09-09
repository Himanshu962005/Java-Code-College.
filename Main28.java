class Main28 {
    final static int ROWS = 10;
    final static int COLUMNS = 10;

    public static void main(String[] args) {
        int product[][] = new int[ROWS][COLUMNS];
        System.out.println("MULTIPLICATION TABLE :\n");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                product[i][j] = (i + 10) * (j + 10);
                System.out.printf("%4d", product[i][j]);
            }
            System.out.println();
        }
    }
}