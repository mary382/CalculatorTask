import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SubCalTest extends BaseClass {

    @Test(dataProvider = "valuesForPositiveSubDoubleTest",groups = "positive")
    public void positiveSubDoubleTest(double a, double b, double expectedValue){
        double result = calculator.sub(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of sub operation.");
    }

    @DataProvider(name = "valuesForPositiveSubDoubleTest")
    public Object[][] valuesForPositiveSubDoubleTest(){
        return new Object[][]{
                {11, 10, 1},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -3, 2},
                {0.1, 1.0, -0.9},
                {0.3,0.4,-0.1},
                {0.4,0.3,0.1},
                {-0.007, 0.3, -0.307},
                {0,1,-1},
                {1,10,-9},
                {Double.MAX_VALUE,Double.MAX_VALUE,0.0},
                {Double.MIN_VALUE,Double.MIN_VALUE, 0.0}
        };
    }

    @Test(dataProvider = "valuesForPositiveSubLongTest",groups = "positive")
    public void positiveSubLongTest(long a, long b, long expectedValue){
        long result = calculator.sub(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of sub operation.");
    }

    @DataProvider(name = "valuesForPositiveSubLongTest")
    public Object[][] valuesForPositiveSubLongTest(){
        return new Object[][]{
                {11, 10, 1},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -3, 2},
                {0,10000,-10000},
                {Long.MIN_VALUE,Long.MIN_VALUE,0},
                {Long.MAX_VALUE,Long.MAX_VALUE, 0}
        };
    }
}
