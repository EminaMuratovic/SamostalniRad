
public class ToyStore {
	private String nameOfTheStore;
	private Toy[] toys;
	public static int howMuch = 0;
	private int numToys;
	
	//konstruktori:
	
	/**
	 * creates an object with the name of the ToyStore, makes default parameters
	 * @param nameOfTheStore String name of the ToysStore
	 */
	public ToyStore(String nameOfTheStore) {
		this.nameOfTheStore = nameOfTheStore;
		toys = new Toy[2];
		numToys = 0;
	}
	
	//dodavanje igracaka:
	
	/**
	 * adds a toy into the Toystore with all of the parameters
	 * @param name String given name of the toy
	 * @param type String given type of the toy
	 * @param price double given price
	 * @param yearOfProduction int given year of production
	 * @param ageRestriction int given age restriction
	 */
	public void addToys(Toy newToy) {
		for(int i = 0; i < numToys; i++) {
			if(toys[i].equals(newToy)) {
				toys[i].increaseQuantity(newToy.getQuantity());
				return;
			}
		}
		
		toys[numToys] = new Toy(newToy);
		numToys++;
		howMuch++;
		if(numToys == toys.length)
			resizeToys();
	}
	
	/**
	 *  resizes the array where the toys are placed
	 */
	private void resizeToys() {
		int newLength = 2 * this.toys.length;
		Toy[] temp = new Toy[newLength];
		for(int i = 0; i < toys.length; i++)
			temp[i] = this.toys[i];
		this.toys = temp;
	}
	
	//ukupno igracaka:
	
	/**
	 * takes the number of all toys in every toystore together
	 * @return number of all toys
	 */
	public int getHowMuchAnimals() {
		return howMuch;
	}
	
	//pretvaranje u string: 
	
	/**
	 *  returns a string representation of the object
	 */
	public String toString() {
		String str = "";
		str += this.nameOfTheStore;
		str += "\nToy list: ";
		for(int i = 0; i < numToys; i++)
			str += "\t" + toys[i].toString();
		str += "\n";
		return str;
	}
	
	//ispisivanje igracaka:
	
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
	
	//izbacivanje igracke:
	
	/**
	 * trows out a toy from the toystore 
	 * @param newToy Toy toy that we want to remove
	 */
	public void ThrowOutTheToy(Toy newToy) {
		
		for(int i = 0; i < numToys; i++) {
			if(toys[i].equals(newToy)) {
				for(int j = 0; j < numToys - 1; j++)
					toys[j] = toys[j+1];
				toys[numToys] = null;
				numToys--;
			}	
		}
	}
	
	//seter za ime ToyStore:
	
	/**
	 * sets the name of the ToyStore
	 * @param nameOfTheStore String name of the Toystore
	 * @return true or false
	 */
	public boolean setName(String nameOfTheStore) {
		if(nameOfTheStore.length() < 1) {
			return false;
		}
		else {
			this.nameOfTheStore = nameOfTheStore;
			return true;
		}
	}
	
	
	
	
	

	
}
