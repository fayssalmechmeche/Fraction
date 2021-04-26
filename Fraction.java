package Fraction;



public class Fraction{

    private int denominateur; // on definit une variable denominateur
    
    private int numerateur; // on definit une variable numerateur
   
    public Fraction(int numerateur,int denominateur) { // on definit une variable local pour pouvoir definir une fraction dans le main 
	 this.numerateur = numerateur;
	 this.denominateur=denominateur;
    }
    

public void setAddtion(Fraction fraction2) { //  permet d'additionner les fraction 
	
    int numerateur = this.numerateur * fraction2.denominateur + this.denominateur * fraction2.numerateur; // on cree une variable local numerateur qui contient le resultat 
    int denominateur = this.denominateur * fraction2.denominateur; // on cree une variable local denominateur qui contient le resultat
    Fraction fractionResultat = new Fraction(numerateur,denominateur); // on cree une fraction qui contient les variables local
    System.out.println(fractionResultat.numerateur+"/"+fractionResultat.denominateur); // on retourne la fraction resultat qui contient les variables
}
public void setSoustraction(Fraction fraction2) {
	int numerateur = this.numerateur*fraction2.denominateur-this.denominateur*fraction2.numerateur; // on cree une variable local numerateur qui contient le resultat 
    int denominateur = this.denominateur * fraction2.denominateur; // on cree une variable local denominateur qui contient le resultat
    Fraction fractionResultat = new Fraction(numerateur,denominateur); // on cree une fraction qui contient les variables local
    System.out.println(fractionResultat.numerateur+"/"+fractionResultat.denominateur); // on retourne la fraction resultat qui contient les variables
}
public void setMultiplication(Fraction fraction2) {
	int numerateur = this.numerateur * fraction2.numerateur; // on cree une variable local numerateur qui contient le resultat 
    int denominateur = this.denominateur * fraction2.denominateur; // on cree une variable local denominateur qui contient le resultat
    Fraction fractionResultat = new Fraction(numerateur,denominateur); // on cree une fraction qui contient les variables local
    System.out.println(fractionResultat.numerateur+"/"+fractionResultat.denominateur); // on retourne la fraction resultat qui contient les variables
    }

public void setDivision(Fraction fraction2) {
	int numerateur = this.numerateur * fraction2.denominateur; // on cree une variable local numerateur qui contient le resultat 
    int denominateur = this.denominateur * fraction2.numerateur; // on cree une variable local denominateur qui contient le resultat
    Fraction fractionResultat = new Fraction(numerateur,denominateur); // on cree une fraction qui contient les variables local
    System.out.println(fractionResultat.numerateur+"/"+fractionResultat.denominateur); // on retourne la fraction resultat qui contient les variables
    }



public void setPGCD(Fraction fraction2) { 
	 while (fraction2.numerateur != denominateur) { // on fait une boucle 
	       if(fraction2.numerateur > denominateur)  // on fait un if qui consiste à tant que le numerateur de la fraction 2 est superieur au denominateur de la fraction 1 
	             fraction2.numerateur = fraction2.numerateur - denominateur; // donc le numerateur est soustrait par le denominateur
	       else
	             denominateur = denominateur - fraction2.numerateur; // sinon  on fait le contraire
	     }
	 System.out.printf("PGCD = %d", denominateur); // on affiche le pgdcd
}

public int getNumerateur() {
    return this.numerateur; // on retourne le numerateur
}
public int getDenominateur() {
    return this.denominateur; // on retourne le denominateur 
}

}
