class Main27 {
    public static void main(String[] args) {
        int number[] = { 55, 40, 80, 65, 71 };
        int n = number.length; // Array Length.
        System.out.print("Given list :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();
        // Sorting Begins.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] > number[j]) {
                    // Interchange Values.
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        // Sorting Ends.
        System.out.print("Sorted list :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();
    }
}