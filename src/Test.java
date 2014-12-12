
public class Test {
	public static void main(String[] args) {
		Toy prvi = new Toy();
		System.out.println(prvi.toString());
		ToyStore jedan = new ToyStore();
		jedan.addToys("Pujdo", "cuko", 50, 2000, 15);
		
		System.out.println("ToyStore num1: " + jedan.toString());
		
		System.out.println(ToyStore.howMuch);
		
	}

}
