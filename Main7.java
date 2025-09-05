class Main7 {
    public static void main(String[] args) {
        int number[] = { 50, 65, 56, 71, 81 };
        int even = 0, odd = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) { // Decide Even or Odd.
                even += 1; // Counting Even Numbers.
            } else {
                odd += 1; // Counting Odd Numbers.
            }
        }
        System.out.println("Even Numbers : " + even + " Odd Numbers : " + odd);
    }
}