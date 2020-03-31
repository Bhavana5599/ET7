package BuildingPattern.BuildingPattern;

public abstract class Softdrink implements ItemType{
	public Packing packing() {
       return new Bottle();
	}

	public abstract float price();

}
