public class Trapezoid extends Shape implements Printable {
      //integer for bases and height
      private int baseA;
      private int baseB;
      private int height;
      
      //trapezoid constructor
      public Trapezoid(int baseA, int baseB, int height){
            this.baseA = baseA;
            this.baseB = baseB;
            this.height = height;
            setShapeName("Trapezoid");
            setShapeType("Quadrilateral");
      }
      
      public void printDescription(){
            System.out.println("Base A is " + baseA + "units.");
            System.out.println("Base B is " + baseB + "units.");
            System.out.println("Height is " + height + "units.");
      }
      
      public double getArea() {
            return ((baseA + baseB)/2) * height;
      }
}
