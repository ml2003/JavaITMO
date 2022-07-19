package trainingthreds;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            RunThread runThread = new RunThread();
            runThread.start();
        }
    }
}
