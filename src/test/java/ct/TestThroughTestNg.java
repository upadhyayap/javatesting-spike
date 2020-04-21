package ct;

import github.ClassUnderTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestThroughTestNg {

    @Test
    public void multiplicationThroughTestNg() {
        ClassUnderTest tester = new ClassUnderTest();

        // assert statements
        Assert.assertEquals(10, tester.multiply(5,2) );
        Assert.assertEquals(true, tester.isEven());
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    // test case 2
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }
}
