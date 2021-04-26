package Fraction;



public class test {
	public static void main(String[] args) {
		System.out.println("lol");
		Fraction fraction = new Fraction(50,10);
		Fraction fraction2 = new Fraction(20,5);
		fraction.setMultiplication(fraction2);
		fraction.setDivision(fraction2);
		fraction.setAddtion(fraction2);
		fraction.setSoustraction(fraction2);
	}
}
