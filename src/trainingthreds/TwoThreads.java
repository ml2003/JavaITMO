package trainingthreds;

public class TwoThreads {
    public static void main(String[] args) {
        Object stop = new Object();
        new ThreadRepeat(stop).start();
        new ThreadRepeat(stop).start();
    }
}
