public class Rhombus extends Shape implements Printable {
      //integer for diagonals
      private int diagonalA;
      private int diagnoalB;
      
      //rhombus constructor
      public Rhombus(int diagonalA, int diagonalB){
            this.diagonalA = diagonalA;
            this.diagonalB = diagonalB;
            setShapeName("Rhombus");
            setShapeType("Quadrilateral");
      }
      
      public void printDescription(){
            System.out.println("Diagonal A is " + diagonalA + "units.");
            System.out.println("Diagonal B is " + diagonalB + "units.");
      }
      
      public double getArea() {
            return (diagonalA * diagonalB) * 0.5;
      }
}
