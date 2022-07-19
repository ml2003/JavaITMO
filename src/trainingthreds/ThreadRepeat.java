package trainingthreds;

public class ThreadRepeat extends Thread {
    private Object stop;

    public ThreadRepeat(Object stop) {
        this.stop = stop;
    }

    public void run() {
        while (true) {
            synchronized (stop) {
                try {
                    System.out.println(getName());
                    stop.notify();
                    stop.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
