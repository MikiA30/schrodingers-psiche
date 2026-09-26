package psiche;

public class Simulation {
    public static void main(String[] args){
      Vector3D position = new Vector3D(1,5,7);
      Proton p1 = new Proton(position);
      Proton p2 = new Proton(new Vector3D(0,0,0));

        System.out.println(p1.getPosition());


    }

}
