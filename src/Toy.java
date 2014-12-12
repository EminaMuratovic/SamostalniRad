
public class Toy {
	private String name;
	private String type;
	private double price;
	private int yearOfProduction;
	private int ageRestriction;

	
	
	//kontruktori:
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public Toy() {
		this("nepoznato", "nepoznato", 0, 2014, 0);
	}
	/**
	 * creates an object with three of the parameters
	 * @param name String given name
	 * @param type String given type
	 * @param price double given price
	 */
	public Toy(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		
	}
	/**
	 * creates an object with four of the parameters and the last parameter is year of production or age restriction
	 * @param name String given name
	 * @param type String given type
	 * @param price double given price
	 * @param yearOfProduction int given year of production or age restriction
	 */
	public Toy(String name, String type, double price, int yearOfProduction) {
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
		
		
	}
	/**
	 * creates an object with all of the parameters
	 * @param name String given name
	 * @param type type String given type
	 * @param price double given price
	 * @param yearOfProduction int given year of production
	 * @param ageRestriction int given age restriction
	 */
	public Toy(String name, String type, double price, int yearOfProduction, int ageRestriction) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.yearOfProduction = yearOfProduction;
		this.ageRestriction = ageRestriction;
		
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
	
	
	//seteri:
	
	/**
	 * sets the given name
	 * @param name String given name
	 * @return true or false
	 */
	public boolean setName(String name) {
		this.name = name;
		return true;
	}
	
	/**
	 * sets the given type
	 * @param type String given type
	 * @return true or false
	 */
	public boolean setType(String type) {
		this.type = type;
		return true;
	}
	
	/**
	 * sets the given price
	 * @param price double given price
	 * @return true or false
	 */
	public boolean setPrice(double price) {
		this.price = price;
		return true;
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
	
	//pretvaranje u string:
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str = "Name: " + name + "; Type: " + type + "; Price: " + price + "; Year of production: " + yearOfProduction + "; Age restriction: " + ageRestriction + ";";
		return str;
	}
	
	//poredjenje:
	
	/**
	 * compares this string to the specified object.
	 * @param other Toy object to compare this String against
	 * @return true or false
	 */
	public String equals(Toy other) {
		String str = "";
		if(this.name == other.name && this.type == other.type && this.price == other.price && this.yearOfProduction == other.yearOfProduction && this.ageRestriction == other.ageRestriction)
			{
			str = "Toys are equal, they are the same.";
			}
		else {
			str = "Toys are not equal, they are not the same.";
		}
		return str;
	}
	
	
}
