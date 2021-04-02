package Fraction;

import java.io.OutputStream;

public class Fraction{

    private int denominateur=2;
    
    private int numerateur=1;
    private int numerateur2=10;
    
  
    
    
    
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
public String setDivision() {
	String resultat = numerateur * denominateur +"/"+ denominateur * numerateur2;
	return resultat;
}

public void setPGCD() {
	 
	 while (numerateur != denominateur) { // on fait 
	       if(numerateur > denominateur)
	             numerateur = numerateur - denominateur;
	       else
	             denominateur = denominateur - numerateur;
	     }
	           
 System.out.printf("PGCD = %d", denominateur);
 }
public void setPGCD2() {
	 
	 while (numerateur2 != denominateur) { // on fait 
	       if(numerateur2 > denominateur)
	             numerateur2 = numerateur2 - denominateur;
	       else
	             denominateur = denominateur - numerateur2;
	     }
	           
System.out.printf("PGCD = %d", denominateur);
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
