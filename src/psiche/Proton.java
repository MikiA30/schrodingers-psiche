package psiche;

public class Proton {
    static final double MASS = 1.67262192595E-27;
    static final double CHARGE = 1.602176634E-19;
    private Vector3D position;
    private Vector3D velocity;

    public Proton(Vector3D position, Vector3D velocity) {
        this.position = position;
        this.velocity = velocity;

    }

    public Vector3D getPosition(){
        return position;
    }

    public Vector3D getVelocity(){
        return velocity;
    }



}
