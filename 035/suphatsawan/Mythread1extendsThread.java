public class Mythread1extendsThread {
    @Override
    public void run() {
        for (int = 1; i <= 5; i++) {
            System.out.println("This thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
