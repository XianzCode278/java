package testData;

public class sampleClass {

	public static void main(String[] args) {

		
		Dice newDice = new Dice();
		newDice.roll();
		System.out.println(newDice.number);
		newDice.rollagain();
		System.out.println(newDice.newNumber);
	}

}
