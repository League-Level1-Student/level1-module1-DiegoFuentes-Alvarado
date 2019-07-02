package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat Garfield = new Cat("Gary");
		Garfield.meow();
		Garfield.printName();
		for(int i = 0; i < 9; i++) {
		Garfield.kill();
		}
	}
}
