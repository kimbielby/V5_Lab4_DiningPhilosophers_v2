import java.util.concurrent.Semaphore;

public class HereWeGo {

    private static Semaphore chop1;
    private static boolean itWorked = false;

    public boolean hereWeGo(){
        chop1 = new Semaphore(1);
        PhiloNice philo1Thread = new PhiloNice(chop1);
        philo1Thread.start();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e){}

        return itWorked;
    }

    public static void setItWorked(boolean b) {
        itWorked = b;
    }
}
