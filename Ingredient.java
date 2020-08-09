package ingredients;

import mainClasses.Money;
import mainClasses.PizzaException;

public abstract class Ingredient implements Comparable {
	
	public Ingredient(String desc, Money m, int cal) {
		throw new RuntimeException("Ingredients not done");
	}
	
		
	@Override
	public int compareTo(Object o) {
		return -1;
	}
	

}
