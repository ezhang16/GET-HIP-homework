public class Circle extends Shape implements Printable {
      //integer for radius
      private int radius;
      
      //circle constructor
      public Circle(int radius){
            this.radius = radius;
            setShapeName("Circle");
            setShapeType("Circle");
      }
      
      public void printDescription(){
            System.out.println("Radius is " + radius + "units."
      }
      
      public double getArea() {
            return Math.PI*(radius * radius);
      }
}
