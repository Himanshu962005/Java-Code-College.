class Main5 {
    public static void main(String args[]) {
        float sum = 0.0F;
        for (int i = 1; i <= 10; i++) {
            sum = sum + 1 / (float) i;
            System.out.println("i = " + i + "   Sum = " + sum);
        }
    }
}