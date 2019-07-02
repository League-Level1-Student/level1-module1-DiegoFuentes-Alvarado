package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String e = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		String i = JOptionPane.showInputDialog("How many minutes do you want to cook it for?");
		Integer.parseInt(i);
		Popcorn poppy = new Popcorn(e);
		Microwave wavy = new Microwave();
		wavy.putInMicrowave(poppy);
		
	}
}
