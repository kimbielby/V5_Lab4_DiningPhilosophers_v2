import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {

    private static Semaphore chop1;
    // private static Semaphore chop2;
    // private static Semaphore chop3;
    // private static boolean isNice;
    private static boolean itWorked = false;

    public Philosopher(){

    }

    public static void setItWorked(boolean itWorked) {
        Philosopher.itWorked = itWorked;
    }

    public boolean getStarted(){

        return itWorked;
    }

}
