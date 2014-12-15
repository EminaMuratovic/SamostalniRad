
public class Toy {
	private String name;
	private String type;
	private double price;
	private int yearOfProduction;
	private int ageRestriction;
	private int quantity;

	
	
	//kontruktori:
	
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public Toy() {
		this("nepoznato", "nepoznato", 0, 2014, 0, 1);
	}
	
	/**
	 * creates an object with three of the parameters
	 * @param name String given name
	 * @param type String given type
	 * @param price double given price
	 */
	public Toy(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = 1;
		
	}
	
	/**
	 * creates an object with four of the parameters and the last parameter is year of production or age restriction
	 * @param name String given name
	 * @param type String given type
	 * @param price double given price
	 * @param yearOfProduction int given year of production or age restriction
	 * @param quantity int given quantity
	 */
	public Toy(String name, String type, double price, int yearOfProduction, int quantity) {
		if(yearOfProduction > 100) 
			{
			this.ageRestriction = yearOfProduction;
			this.yearOfProduction = 2014;
			}
		else {
			this.yearOfProduction = yearOfProduction;
			this.ageRestriction = 0;
			}
		this.name = name;
		this.type = type;
		this.price = price;	
		this.quantity = quantity;
		
		
	}
	
	/**
	 * creates an object with all of the parameters
	 * @param name String given name
	 * @param type type String given type
	 * @param price double given price
	 * @param yearOfProduction int given year of production
	 * @param ageRestriction int given age restriction
	 * @param quantity int given quantity
	 */
	public Toy(String name, String type, double price, int yearOfProduction, int ageRestriction, int quantity) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.yearOfProduction = yearOfProduction;
		this.ageRestriction = ageRestriction;
		this.quantity = quantity;
		
	}
	
	//kontruktor kopije:
	
	/**
	 * copies one object to another
	 * @param other Toy object the we want to copy
	 */
	public Toy(Toy other) {
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.yearOfProduction = other.yearOfProduction;
		this.ageRestriction = other.ageRestriction;
		this.quantity = other.quantity;
		
	}
	
	//geteri:
	
	/**
	 * gets the name of the toy
	 * @return name of the toy
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * gets the type of the toy
	 * @return type of the toy
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * gets the price of the toy
	 * @return price of the toy
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * gets the year of production of the toy
	 * @return year of production of the toy
	 */
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	/**
	 * gets the age restriction of the toy
	 * @return age restriction of the toy
	 */
	public int getAgeRestriction() {
		return ageRestriction;
	}
	
	/**
	 * gets the quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	
	//seteri:
	
	/**
	 * sets the given name
	 * @param name String given name
	 * @return true or false
	 */
	public boolean setName(String name) {
		if(name.length() < 1) {
			return false;
		}
		else {
			this.name = name;
			return true;
		}
		
	}
	
	/**
	 * sets the given type
	 * @param type String given type
	 * @return true or false
	 */
	public boolean setType(String type) {
		if(type.length() < 1) {
			return false;
		}
		else {
			this.type = type;
			return true;
		}
		
	}
	
	/**
	 * sets the given price
	 * @param price double given price
	 * @return true or false
	 */
	public boolean setPrice(double price) {
		if(price < 0) {
			return false;
		}
		else {
			this.price = price;
			return true;
		}
		
	}
	
	/**
	 * sets the given year of production
	 * @param yearOfProduction int year of production
	 * @return true or false
	 */
	public boolean setYearOfProduction(int yearOfProduction) {
		if(yearOfProduction < 1000)
			return false;
		else {
			this.yearOfProduction = yearOfProduction;
			return true;
		}
	}
	
	/**
	 * sets the given age restriction
	 * @param ageRestriction int age restriction
	 * @return true or false
	 */
	public boolean setAgeRestriction(int ageRestriction) {
		if(ageRestriction > 100)
			return false;
		else {
			this.ageRestriction = ageRestriction;
			return true;
		}
	}
	
	/**
	 * sets the given quantity
	 * @param quantity int quantity
	 * @return true or false
	 */
	public boolean setQuantity(int quantity) {
		if(quantity < 1) {
			return false;
		}
		else {
			this.quantity = quantity;
			return true;
		}
	}
	
	//pretvaranje u string:
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str += "\n\tName: " + name;
		str += "\n\tType: " + type;
		str += "\n\tPrice: " + price;
		str += "\n\tYear of production: " + yearOfProduction;
		str += "\n\tAge restriction: " + ageRestriction;
		str += "\n\tQuantity: " + quantity  + "\n";
		
		return str;
	}
	
	//poredjenje:
	
	/**
	 * compares this string to the specified object.
	 * @param other Toy object to compare this String against
	 * @return true or false
	 */
	public boolean equals(Toy other) {
	
		if(this.name == other.name && this.type == other.type && this.price == other.price && this.yearOfProduction == other.yearOfProduction && this.ageRestriction == other.ageRestriction)
			{
			return true;
			}
		else {
			return false;
		}
		
	}
	
	//povecavanje kolicine istih igracaka:
	
	/**
	 * increases the quantity of the toy
	 * @param additional how much to increase
	 */
	public void increaseQuantity(int additional) {
		this.quantity += additional;
	}
	
	
}
