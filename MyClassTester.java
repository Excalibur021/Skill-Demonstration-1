import static org.junit.Assert.*;
import org.junit.*;

public class MyClassTester {
    @Test
    public void testAdd() {
        assertEquals(2, MyClass.add(1, 1));
    }
}
