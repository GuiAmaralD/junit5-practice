package general;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArrayTest {


    @Test
    void testArrayEquals(){
        int[] numbers = {4, 32, 1, 8, 12};
        int[] sorted = {1, 4, 8, 12, 32};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, sorted);
    }

    @Test
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance(){
        int[] numbers = {25, 8, 21, 32, 3};
        for(int i =0; i < 100000000; i++){
            Arrays.sort(numbers);
        }
    }
}
