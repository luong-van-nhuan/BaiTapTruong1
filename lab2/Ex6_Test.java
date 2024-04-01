package lab2;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex6_Test {

    private static final double DELTA = 0.001;

    @Test
    public void testIsTriangleValid() {
       
        assertEquals("Tam giác với các cạnh 3, 4, 5 nên hợp lệ.", true, Ex6.isTriangleValid(3, 4, 5));

        assertEquals("Tam giác với các cạnh 1, 2, 3 không hợp lệ.", false, Ex6.isTriangleValid(1, 2, 3));
    }

    @Test
    public void testCalculatePerimeter() {
       
        assertEquals("Chu vi của tam giác không chính xác.", 12.0, Ex6.calculatePerimeter(3, 4, 5), DELTA);
    }

    @Test
    public void testCalculateArea() {
      
        assertEquals("Diện tích của tam giác không chính xác.", 6.0, Ex6.calculateArea(3, 4, 5), DELTA);
    }

    @Test
    public void testCalculateAngles() {
        double a = 3, b = 4, c = 5;
        double angleA = Ex6.calculateAngleA(a, b, c);
        double angleB = Ex6.calculateAngleB(a, b, c);
        double angleC = Ex6.calculateAngleC(a, b, c);

        assertEquals("Góc A của tam giác không chính xác.", Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c))), angleA, DELTA);

        assertEquals("Góc B của tam giác không chính xác.", Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c))), angleB, DELTA);

        assertEquals("Góc C của tam giác không chính xác.", Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b))), angleC, DELTA);
    }
}
