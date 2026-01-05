class X implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\tThread X : " + i);
        }
        System.out.println("End of Thread X");
    }
}

class Main46 { // RunnableTest.
    public static void main(String[] args) {
        X runnable = new X();
        Thread threadX = new Thread(runnable);
        threadX.start();
        System.out.println("End of Main Thread");
    }
}