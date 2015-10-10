public class Triangle extends Shape implements Printable {
      //integer for base and height
      private int base;
      private int height;
      
      //triangle constructor
      public Triangle(int base, int height){
            this.base = base;
            this.height = height;
            setShapeName("Triangle");
            setShapeType("Triangle");
      }
      
      public void printDescription(){
            System.out.println("Base is " + base + "units.");
            System.out.println("Height is " + height + "units.");
      }
      
      public double getArea() {
            return height*base*0.5;
      }
}
