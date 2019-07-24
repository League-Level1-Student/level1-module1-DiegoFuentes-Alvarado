package _06_duck;

public class Runner {
	public static void main(String[] args) {
		Duck dorito = new Duck("bananaBread", 12);
		dorito.quack();
		dorito.waddle();
		Dog doggis = new Dog();
		doggis.bark();
	}
}
