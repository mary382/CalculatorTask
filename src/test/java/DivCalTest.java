import org.testng.annotations.Test;


public class DivCalTest extends BaseClass {

    @Test(expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDivOnZero(){
        calculator.div(1,0);
    }

}
