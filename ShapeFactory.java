
public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("Triangle")){
         return new Triangle();
      }
      
      return null;
   }
}