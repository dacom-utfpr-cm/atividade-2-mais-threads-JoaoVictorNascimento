package exe2;

public class ThreadSleep implements Runnable {
    @Override
    public void run(){
        try {
            while(true){
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
        }
    }
}
