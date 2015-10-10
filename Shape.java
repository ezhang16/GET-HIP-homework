public abstract class Shape implements Principle{

      //type: triangle, quadrilateral, circle
      private String shapeType;
      //name: rectangle, rhombus
      private String shapeName;
      
      //getter and setter for shape type
      public String getShapeType() {
            return shapeType;
      }
      public String setShapeType(String type) {
            shapeType = newShapeType;
      }
      
      //getter and setter for shape name
      public String getShapeName() {
            return shapeName;
      }
      public String setShapeName(String name) {
            shapeName = newShapeName;
      }
      
      public abstract double getArea();
}
