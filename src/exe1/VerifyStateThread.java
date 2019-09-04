package exe1;

import java.util.ArrayList;

public class VerifyStateThread implements Runnable {
    private ArrayList<Thread> threads;
    public Thread thread;

    public VerifyStateThread(ArrayList<Thread> threads){
        this.threads = threads;
    }

    @Override
    public void run(){
        while (true){
            try{
                for(Thread thread: this.threads) {
                    System.out.println("Thread Name: " + thread.getName() + "," + "State: " + thread.getState() );
                }
                Thread.sleep(3000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
