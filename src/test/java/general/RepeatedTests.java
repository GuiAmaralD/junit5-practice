package general;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTests {

    //repeated test
    @RepeatedTest(4)
     void repetitionTest(RepetitionInfo info){
        System.out.println(info.getCurrentRepetition());
        System.out.println(info.getFailureCount());
        assertTrue(true);
    }
}
