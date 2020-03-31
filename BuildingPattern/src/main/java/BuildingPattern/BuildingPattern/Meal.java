package BuildingPattern.BuildingPattern;

import java.util.List;
import java.util.ArrayList;

public class Meal {
	private List<ItemType> items = new ArrayList<ItemType>();	

	   public void addItem(ItemType item){
	      items.add(item);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (ItemType item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (ItemType item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
	      }		
	   }

	public void addItem(Vegburger item) {
		// TODO Auto-generated method stub
		
	}	

}