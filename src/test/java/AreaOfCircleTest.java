
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaOfCircleTest {

    AreaOfCircle obj = new AreaOfCircle();

    @Test
    public void testArea() {
        assertEquals(78.5398,
                obj.calculateArea(5), 0.0001);
    }

    @Test
    public void testZeroRadius() {
        assertEquals(0.0, obj.calculateArea(0));
    }

    @Test
    public void testSmallRadius() {
        assertEquals(12.5664,
                obj.calculateArea(2), 0.0001);
    }
}

