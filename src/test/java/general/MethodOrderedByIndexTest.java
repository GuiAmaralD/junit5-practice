package general;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(Lifecycle.PER_CLASS)
public class MethodOrderedByIndexTest {

    StringBuilder builder = new StringBuilder();


    @AfterEach
    void afterEach(){
        System.out.println("The actual value is " + builder);
    }

    @Test
    @Order(2)
    void testA(){
        System.out.println("Running test A");
        builder.append("1");
    }

    @Test
    @Order(3)
    void testB(){
        System.out.println("Running test B");
        builder.append("2");
    }

    @Test
    @Order(1)
    void testC(){
        System.out.println("Running test C");
        builder.append("3");
    }

    @Test
    @Order(4)
    void testD(){
        System.out.println("Running test D");
        builder.append("4");
    }
}
