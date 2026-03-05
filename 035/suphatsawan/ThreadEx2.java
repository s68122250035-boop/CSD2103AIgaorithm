public class ThreadEx2 {
    public static void main(String[] args) throws
            InterruptedException {
        MyThreadextends t1 = new MyThreadextends();
        t1.start();
        t1.join(); // Wait for t1 to finish before proceeding
        System.out.println("Main thread is exiting.");
    }
}
