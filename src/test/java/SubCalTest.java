import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalTest extends BaseClass {

    @Test
    public void twoMinusOneTest(){
        long result = calculator.sub(2,1);
        Assert.assertTrue(result==1, "Invalid result of sub operation!");
    }

}
