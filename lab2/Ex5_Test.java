package lab2;

import org.junit.Assert;
import org.junit.Test;

public class Ex5_Test {

    @Test
    public void testOneSegmentWithinAnother() {
        double a1 = 2, b1 = 8;
        double a2 = 5, b2 = 7;
        double[] expected = {2, 6};
        double[] result = Ex5.calculateIntersectionAndUnion(a1, b1, a2, b2);
        Assert.assertEquals("Phần giao nhau không chính xác khi một đoạn nằm hoàn toàn bên trong đoạn kia.", expected[0], result[0], 0.001);
        Assert.assertEquals("Phần hợp không chính xác khi một đoạn nằm hoàn toàn bên trong đoạn kia.", expected[1], result[1], 0.001);
    }

    @Test
    public void testAdjacentSegments() {
        double a1 = 1, b1 = 3;
        double a2 = 3, b2 = 5;
        double[] expected = {0, 4}; 
        double[] result = Ex5.calculateIntersectionAndUnion(a1, b1, a2, b2);
        Assert.assertEquals("Phần giao nhau không chính xác khi các đoạn liền kề nhau.", expected[0], result[0], 0.001);
        Assert.assertEquals("Phần hợp không chính xác khi các đoạn liền kề nhau.", expected[1], result[1], 0.001);
    }

    @Test
    public void testIdenticalSegments() {
        double a1 = 1, b1 = 5;
        double a2 = 1, b2 = 5;
        double[] expected = {4, 4}; 
        double[] result = Ex5.calculateIntersectionAndUnion(a1, b1, a2, b2);
        Assert.assertEquals("Phần giao nhau không chính xác khi các đoạn trùng nhau.", expected[0], result[0], 0.001);
        Assert.assertEquals("Phần hợp không chính xác khi các đoạn trùng nhau.", expected[1], result[1], 0.001);
    }

}
