class Main9 {
    public static void main(String[] args) {
        int RollNumber[] = { 111, 222, 333, 444 };
        int Marks[] = { 81, 75, 43, 58 };
        for (int i = 0; i < RollNumber.length; i++) {
            if (Marks[i] > 79) {
                System.out.println(RollNumber[i] + " Honors");
            } else if (Marks[i] > 59) {
                System.out.println(RollNumber[i] + " First Division");
            } else if (Marks[i] > 49) {
                System.out.println(RollNumber[i] + " Second Division");
            } else {
                System.out.println(RollNumber[i] + " FAIL");
            }
        }
    }
}