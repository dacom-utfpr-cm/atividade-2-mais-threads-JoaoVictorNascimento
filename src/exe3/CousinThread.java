package exe3;

public class CousinThread implements Runnable {
    private int begin, end;

    public CousinThread(int begin, int end){
        this.begin = begin;
        this.end = end;
    }

    boolean isCousin(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        if(n == 0 || n == 1){
            return false;
        }
        return true;
    }

    @Override
    public void run(){
        for(int i = this.begin; i < this.end; i++) {
            if(isCousin(i)){
                System.out.println(i);
            }
        }
    }
}
