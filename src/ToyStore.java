
public class ToyStore {
	private String nameOfTheStore;
	private Toy[] toys;
	public static int howMuch = 0;
	private int numToys;
	
	//konstruktori:
	
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public ToyStore() {
		toys = new Toy[2];
		numToys = 0;
	}
	
	/**
	 * adds a toy into the Toystore with all of the parameters
	 * @param name String given name of the toy
	 * @param type String given type of the toy
	 * @param price double given price
	 * @param yearOfProduction int given year of production
	 * @param ageRestriction int given age restriction
	 */
	public void addToys(String name, String type, double price, int yearOfProduction, int ageRestriction) {
		toys[numToys] = new Toy(name, type, price, yearOfProduction, ageRestriction);
		numToys++;
		howMuch++;
		if(numToys == toys.length)
			resizeToys();
	}
	
	/**
	 *  resizes the array where the toys are placed
	 */
	public void resizeToys() {
		int newLength = 2 * toys.length;
		Toy[] temp = new Toy[newLength];
		for(int i = 0; i < toys.length; i++)
			temp[i] = toys[i];
		toys = temp;
	}
	
	/**
	 * takes the number of all toys in every toystore together
	 * @return number of all toys
	 */
	public int getHowMuchAnimals() {
		return howMuch;
	}
	
	/**
	 *  returns a string representation of the object
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < toys.length; i++)
			str += toys[i].toString();
		return str;
	}
	
	/**
	 * takes all toys that have the same type
	 * @param type String given type of the toy
	 * @return all the toys
	 */
	public String printByQuantity(String type) {
		String str = "";
		for(int i = 0; i < toys.length; i++) {
			if(toys[i].getType().equals(type))
				str += toys[i].toString();
		}
		return str;
	}
	
	/**
	 * takes all toys that have the same age restriction
	 * @param ageRestriction int given age restriction
	 * @return all the toys
	 */
	public String printByAgeRestriction(int ageRestriction) {
		String str = "";
		for(int i = 0; i < toys.length; i++) {
			if(toys[i].getAgeRestriction() == ageRestriction)
				str += toys[i].toString();
		}
		return str;
	}
	
	/**
	 * takes all toys that have the same name
	 * @param name String given name
	 * @return all the toys
	 */
	public String printByName(String name) {
		String str = "";
		for(int i = 0; i < toys.length; i++) {
			if(toys[i].getName().equals(name))
				str += toys[i].toString();
		}
		return str;
	}
	
	/**
	 * takes all toys that have the same year of production
	 * @param yearOfProduction int given year of production
	 * @return all the toys
	 */
	public String printByYearOfProduction(int yearOfProduction) {
		String str = "";
		for(int i = 0; i < toys.length; i++) {
			if(toys[i].getYearOfProduction() == yearOfProduction)
				str += toys[i].toString();
		}
		return str;
	}
	
	/**
	 * trows out a toy from the toystore 
	 * @param name String given name of the toy
	 * @param type String given type of the toy
	 * @param price double given price of the toy
	 * @param yearOfProduction int given year of production of the toy
	 * @param ageRestriction int given age restriction
	 */
	public void ThrowOutTheToy(String name, String type, double price, int yearOfProduction, int ageRestriction) {
		int newLength = toys.length - 1;
		Toy[] temp = new Toy[newLength];
		for(int i = 0; i < toys.length; i++) {
			if(!toys[i].getName().equals(name) && toys[i].getPrice() != price && !toys[i].getType().equals(type) && toys[i].getYearOfProduction() != yearOfProduction && toys[i].getAgeRestriction() != ageRestriction)
				temp[i] = toys[i];
		}
		toys = temp;
	}
	

	
}
