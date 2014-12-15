
public class Test {
	public static void main(String[] args) {
		Toy prva = new Toy();
		Toy druga = new Toy("name2", "tip2", 12.32, 1989,2);
		Toy treca = new Toy("name3", "tip3", 11.50, 2000,3);
		Toy cetvrta = new Toy("name4", "tip4", 9.2, 2002,0);
		ToyStore store = new ToyStore("Store 1");
		store.addToys(prva);
		store.addToys(druga);
		store.addToys(treca);
		store.addToys(cetvrta);
		
		
		store.ThrowOutTheToy(prva);
		
		System.out.println(store.toString());
		
		
	}

}
