package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	void quack() {System.out.println("queck");}
	void waddle() {System.out.println("waddle away, waddle, waddle");}
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
}
