import java.util.concurrent.Semaphore;

public class PhiloNice extends Philosopher{

    Semaphore chop1;
    //boolean worked = false;
    public PhiloNice(Semaphore chop1){
        // super(worked);
        this.chop1 = chop1;

    }

    public void run(){
        try {
            chop1.acquire();
            HereWeGo.setItWorked(true);
        }
        catch (Exception e){}
    }
}
