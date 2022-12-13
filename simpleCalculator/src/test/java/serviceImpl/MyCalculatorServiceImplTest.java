package serviceImpl;

import org.junit.Test;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyCalculatorServiceImplTest {

    MyCalculatorServiceImpl service =  new MyCalculatorServiceImpl();

    @Test
    public void add_success() {
        assertEquals(12, service.add(new int[] {1,2,3,6}));
    }
    @Test
    public void add_empty() {
        assertEquals(0, service.add(new int[] {}));
    }
    @Test
    public void add_oneValue() {
        assertEquals(3, service.add(new int[] {3}));
    }
    @Test
    public void subtract_success() {
        assertEquals(8, service.subract(16, 8));
    }
    @Test
    public void subtract_zero() {
        assertEquals(5,service.subract(5, 0));
    }
    @Test
    public void subtract_failure() {
        assertNotEquals(8, service.subract(7, 3));
    }
}

