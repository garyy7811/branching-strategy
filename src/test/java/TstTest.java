import junit.framework.TestCase;
import org.junit.Assert;

public class TstTest extends TestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        inst = new Tst(0);
    }

    private Tst inst;

    public void testProcessed() {
        inst.process();
        Assert.assertEquals("220", 220, inst.getValue());
    }
}