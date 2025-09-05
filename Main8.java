class Main8 {
    public static void main(String[] args) {
        int a = 325, b = 712, c = 478;
        int largest;
        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        System.out.println("Largest value is : " + largest);
    }
}