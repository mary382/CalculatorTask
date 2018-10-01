import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTest extends BaseClass {

    @Test(dataProvider = "valuesForPositiveMultDoubleTest", groups = "positive")
    public void positiveMultDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);

    }

    @DataProvider(name = "valuesForPositiveMultDoubleTest")
    public Object[][] valuesForPositiveMultDoubleTest() {
        return new Object[][]{
                {1, 0, 0},
                {0, 0, 0},
                {0.3, 0.4, 0.12},
                {-0.5, -0.3, 0.15},
                {-10.2, 2, -20.4},
                {Long.MIN_VALUE, Long.MIN_VALUE, 0},
                {Long.MAX_VALUE,Long.MAX_VALUE, 1}
        };
    }

}
