import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {
  @Test
    public void newTriangle_instatiatesCorrectly(){
      Triangle newTriangle = new Triangle(3,3,3);
      assertEquals(true, newTriangle instanceof Triangle);
    }

  @Test
    public void triangleType_notATriangle(){
      Triangle newTriangle = new Triangle(1,1,8);
      assertEquals("Not A Triangle", newTriangle.triangleType());
    }

  @Test
    public void triangleType_equilateralTriangle(){
      Triangle newTriangle = new Triangle(3,3,3);
      assertEquals("Equilateral", newTriangle.triangleType());
    }

  @Test
    public void triangleType_isocelesTriangle(){
      Triangle newTriangle = new Triangle(2,2,3);
      assertEquals("Isoceles", newTriangle.triangleType());
    }

  @Test
    public void triangleType_scaleneTriangle(){
    Triangle newTriangle = new Triangle(1,2,3);
    assertEquals("Scalene", newTriangle.triangleType());
  }
}
