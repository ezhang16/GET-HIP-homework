public class Rectangle extends Shape implements Printable {
      //integer for height and width
      private int height;
      private int width;
      
      //rectangle constructor
      public Rectangle(int height, int width){
            this.height = height;
            this.width = width;
            setShapeName("Rectangle");
            setShapeType("Quadrilateral");
      }
      
      public void printDescription(){
            System.out.println("Height is " + height + "units.");
            System.out.println("Width is " + width + "units.");
      }
      
      public double getArea() {
            return height*width;
      }
}
