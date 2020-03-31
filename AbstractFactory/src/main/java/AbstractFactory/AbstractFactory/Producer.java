package AbstractFactory.AbstractFactory;

public class Producer {
	public static AFPattern getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShape();         
	      }else{
	         return new ShapeFactory();
	      }
	   }

}
