package multithreading;

public class BasicThread {
    public static void main(String[] args) {

        Thread thread1 = new BasicThreadClass("Thread-1");
        Thread thread2 = new BasicThreadClass("Thread-2");

        thread1.start();
        thread2.start();

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}

class BasicThreadClass extends Thread {
    private String threadName;

    public BasicThreadClass(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", Count: " + i);
                Thread.sleep(50); // Pause for 50 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
