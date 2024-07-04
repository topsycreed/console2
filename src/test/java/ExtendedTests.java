import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtendedTests {

    @Test
    void extendedTest() {
        String text = "ExtendedTestRun";
        System.out.println(text);
        Assert.assertEquals(text, "ExtendedTestRun");
    }
}
