package Fraction;

public class Fraction{

    private int denominateur=10;
    
    private int numerateur=10;
    private int numerateur2=5;
    
    private int pgcd;
    
    
    
Fraction() {
	 
    }
String setFraction() {
        String resultat = numerateur +"/"+ denominateur;
        return  resultat;
    }
String setFraction2() {
    String resultat = numerateur2 +"/"+ denominateur;
    return  resultat;
}
public String setAddtion() {
    String resultat = numerateur + numerateur2 + "/"+ denominateur ;
    return resultat; 
}
public String setSoustraction() {
    String resultat = numerateur - numerateur2   + "/"+ denominateur;
    return resultat; 
}
public String setMultiplication() {
    String resultat = numerateur2*numerateur   + "/"+ denominateur*denominateur;
    return resultat; 
}
public int getNumerateur() {
    return this.numerateur;
}
public int getDenominateur() {
    return this.denominateur;
}
public int getNumerateur2() {
    return this.numerateur2;
}
public int getDenominateur2() {
    return this.denominateur;
}

}
