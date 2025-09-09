class Mathoperation {
    static float mul(float x, float y) {
        return x * y;
    }

    static float divide(float x, float y) {
        return x / y;
    }
}

class Main21 {
    public static void main(String[] args) {
        float a = Mathoperation.mul(4.0f, 5.0f);
        float b = Mathoperation.divide(a, 2.0f);
        System.out.println("b = " + b);
    }
}