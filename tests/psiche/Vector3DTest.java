package psiche;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector3DTest {

    @DisplayName("WHEN the scale() method is called on a vector, "
            + "THEN each component of the vector is multiplied by the "
            + "scalar and a new vector is returned")

    @Test

    public void testScaleMethod() {

        Vector3D v = new Vector3D(2, 3, 4);
        double s = 0.5;

        Vector3D result = v.scale(s);

        assertEquals(1, result.getX());
        assertEquals(1.5, result.getY());
        assertEquals(2, result.getZ());

    }

    @DisplayName("WHEN the add() method is called in the format a.add(b) with a and b both being "
            + "vectors, THEN the result is a new vector whose components "
            + "are the sum of a's and b's components ")

    @Test

    public void testAddMethod() {

        Vector3D v1 = new Vector3D(2, 3, 4);
        Vector3D v2 = new Vector3D(2,10,2);

        Vector3D result = v1.add(v2);

        assertEquals(4, result.getX());
        assertEquals(13, result.getY());
        assertEquals(6, result.getZ());

    }

    @DisplayName("WHEN magnitude() method is called on a vector, THEN it should "
            + "return the length of the vector")

    @Test

    public void testMagnitude() {

        Vector3D v1 = new Vector3D(1,0,0);


        assertEquals(1, v1.magnitude());

    }



}
