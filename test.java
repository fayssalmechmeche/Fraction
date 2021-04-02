package Fraction;



public class test {
	public static void main(String[] args) {
		System.out.println("lol");
		Fraction fraction = new Fraction();
		Fraction fraction2 = new Fraction();
		System.out.println("Fraction 1  : ");
		System.out.println("Numerateur est egale à : "+fraction.getNumerateur());
		System.out.println("Denominateur est egale à :"+fraction.getDenominateur());
		System.out.println("fraction2:"+fraction.setFraction());
		System.out.println("Fraction 2  : ");
		System.out.println("Numerateur est egale à : "+fraction2.getNumerateur2());
		System.out.println("Denominateur est egale à :"+fraction2.getDenominateur2());
		System.out.println("fraction2:"+fraction.setFraction2());
		System.out.println("addition"+fraction.setAddtion());
		System.out.println("soustraction"+fraction.setSoustraction());
		System.out.println("multiplication"+fraction.setMultiplication());
		fraction2.setPGCD();
		System.out.println("\n");
		fraction2.setPGCD2();
		System.out.println("\n");
		System.out.println("multiplication"+fraction.setDivision());
	}
}
