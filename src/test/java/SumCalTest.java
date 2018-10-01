import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumCalTest extends BaseClass {

    @Test(dataProvider = "valuesForPositiveSumDoubleTest",groups = "positive")
    public void positiveSumDoubleTest(double a, double b, double expectedValue){
        double result = calculator.sum(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of sum operation.");
    }

    @DataProvider(name = "valuesForPositiveSumDoubleTest")
    public Object[][] valuesForPositiveSumDoubleTest(){
        return new Object[][]{
                {10, 11, 21},
                {10, -1, 9},
                {0, 0, 0},
                {-1, -3, -4},
                {0.1, 1.0, 1.1},
                {0.3,0.4,0.7},
                {-0.007, 0.3, 0.293},
                {0,1,1},
                {1,10,11},
                {Double.MAX_VALUE,Double.MAX_VALUE,Double.POSITIVE_INFINITY},
                {Double.MIN_VALUE,Double.MIN_VALUE,1.0E-323}
        };
    }

    @Test(dataProvider = "valuesForPositiveSumLongTest",groups = "positive")
    public void positiveSumLongTest(long a, long b, long expectedValue){
        long result = calculator.sum(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of sum operation.");
    }

    @DataProvider(name = "valuesForPositiveSumLongTest")
    public Object[][] valuesForPositiveSumLongTest(){
        return new Object[][]{
                {10, 11, 21},
                {10, -1, 9},
                {0, 0, 0},
                {-1, -3, -4},
                {0,10000,10000},
                {Long.MIN_VALUE,Long.MIN_VALUE,0},
                {Long.MAX_VALUE,Long.MAX_VALUE,-2}
        };
    }
}
