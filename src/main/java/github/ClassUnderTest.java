package github;

import java.util.Random;

public class ClassUnderTest {

    public int multiply(int first, int second) {
        return first*second;
    }

    public boolean isEven () {
        Random random = new Random();
        random.setSeed(100);
        int number = random.nextInt();
        int lastBit = number & 0;

        //return lastBit == 0 ?  false : true;
        return true;
    }
}
