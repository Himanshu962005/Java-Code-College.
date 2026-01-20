// Create an array of 5 floats and calculate their sum.
class Main96 { // SumFloatArray.
    public static void main(String[] args) {
        float[] arr = { 1.5f, 2.5f, 3.0f, 4.5f, 5.5f };
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}