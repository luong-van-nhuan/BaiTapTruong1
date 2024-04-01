package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ex7_Test {

    @Test
    void testDetermineTriangleType() {
        assertEquals("Tam giác đều", Ex7.determineTriangleType(5, 5, 5));
        assertEquals("Tam giác cân", Ex7.determineTriangleType(5, 5, 3));
        assertEquals("Tam giác vuông cân", Ex7.determineTriangleType(5, 5, Math.sqrt(50)));
        assertEquals("Tam giác vuông", Ex7.determineTriangleType(3, 4, 5));
        assertEquals("Tam giác thường", Ex7.determineTriangleType(2, 3, 4));
        assertEquals("Không phải là tam giác", Ex7.determineTriangleType(0, 3, 4));
    }
    
    @Test
    void testIsTriangleValid() {
        assertTrue(Ex7.isTriangleValid(5, 5, 5));
        assertTrue(Ex7.isTriangleValid(3, 4, 5));
        assertFalse(Ex7.isTriangleValid(1, 2, 3));
        assertFalse(Ex7.isTriangleValid(-1, 2, 3));
        assertFalse(Ex7.isTriangleValid(0, 2, 3));
    }

    @Test
    void testIsRightAngle() {
        assertTrue(Ex7.isRightAngle(3, 4, 5));
        assertFalse(Ex7.isRightAngle(5, 5, 5));
        assertFalse(Ex7.isRightAngle(2, 3, 4));
    }
}
