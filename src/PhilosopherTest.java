import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PhilosopherTest {
    // private static final double ACCURACY = 0.1;

    private HereWeGo hereWeGo;

    @Before
    public void setup(){
        hereWeGo = new HereWeGo();
    }

    @Test
    public void testSemaphoreAcquiral(){
        assertEquals("Chopstick not acquired", true, hereWeGo.hereWeGo());
    }


}
