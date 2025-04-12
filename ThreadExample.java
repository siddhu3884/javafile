// Define a class that extends Thread
class MyThread extends Thread {
    @Override
    public void run() {
        // Code that runs in the thread
        System.out.println("Thread is running!");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of the MyThread class
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();
    }
}