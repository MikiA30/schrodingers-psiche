package psiche;

public class Vector3D {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%.3f ,%.3f ,%.3f)", x, y, z);
    }

    // Created general form of vector addition, may be used later
    public Vector3D vectorSum(Vector3D... vectors) {

        double x = this.x;
        double y = this.y;
        double z = this.z;

        for (Vector3D i : vectors) {
            x += i.getX();
            y += i.getY();
            z += i.getZ();
        }
        return new Vector3D(x, y, z);
    }

    // for adding two vectors in the form a.add(b)
    public Vector3D add(Vector3D other) {
        double x = this.x + other.getX();
        double y = this.y + other.getY();
        double z = this.z + other.getZ();
        return new Vector3D(x, y, z);
    }

    public Vector3D scale(double scalar) {
        double x = this.x * scalar;
        double y = this.y * scalar;
        double z = this.z * scalar;

        return new Vector3D(x, y, z);
    }

    public Vector3D subtract(Vector3D other) {
        double x = this.x - other.getX();
        double y = this.y - other.getY();
        double z = this.z - other.getZ();
        return new Vector3D(x, y, z);
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y ,2) + Math.pow(z ,2));
    }



}
