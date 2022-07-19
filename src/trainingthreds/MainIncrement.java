package trainingthreds;

public class MainIncrement {
    public static void main(String[] args) {

        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            IncrementThread incrementThread = new IncrementThread(counter);
            incrementThread.start();
            try {
                incrementThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("итоговый " + counter.getCount());
        }

    }
}

