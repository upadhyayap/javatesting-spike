package ct;

import github.ClassUnderTest;
import  org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void multiplicationTest() {
        ClassUnderTest tester = new ClassUnderTest();

        // assert statements
        Assert.assertEquals(12, tester.multiply(5,2) );
        Assert.assertEquals(true, tester.isEven());
    }

    @Test
    public void EvenNUmberTest() {
        ClassUnderTest tester = new ClassUnderTest();

        // assert statements
        Assert.assertEquals(true, tester.isEven());
    }
}
