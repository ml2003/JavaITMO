package trainingthreds;

public class RunThread extends Thread  {

    @Override
    public void run() {


        for (int i = 1; i < 101; i++) {
              System.out.println(getName() + " :" + i);
                   }
    }
}
