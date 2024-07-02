import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests {

    @Test
    void simpleTest() {
        String text = "SimpleTestRun";
        System.out.println(text);
        Assert.assertEquals(text, "SimpleTestRun");
    }
}
