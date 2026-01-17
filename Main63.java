class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Main63 {// TestMyException.
    public static void main(String args[]) {
        int x = 5, y = 1000;
        try {
            float z = (float) x / (float) y;
            if (z < (0.01)) {
                throw new MyException("I am a Legendary Coder.");
            }
        } catch (MyException e) {
            System.out.println("My Name is Himanshu Maheshwari.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am Pursuing BCA + MCA.");
        }
    }
}