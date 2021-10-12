package testData;

public class Dice {
	
	int number = 0;
	int newNumber = 0;
	
	public void roll() {
		
		number = ((int)(Math.random()*6))+1;	
	}
	
	public void rollagain() {
		newNumber = ((int)(Math.random()*10))+1;	
	}
	
	
}
