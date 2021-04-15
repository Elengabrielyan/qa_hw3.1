import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestJunit {
    @Test
    public void testAdd() {
        String str = "Junit testing using TestNG";
        AssertEquals("Junit testing using TestNG",str);
    }
}