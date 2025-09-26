package fr.uvsq.td.monprojet;

public class Fraction extends Number {
     private int numerateur;
    private int denominateur;

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);


    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // Constructeur avec un seul argument
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    // Constructeur sans argument
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

 
    //getters
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }
public Fraction add(Fraction other) {
    // (a/b) + (c/d) = (ad + bc) / (bd)
    int num = this.numerateur * other.denominateur + other.numerateur * this.denominateur;
    int den = this.denominateur * other.denominateur;
    return new Fraction(num, den);
}
        @Override
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }
         @Override
       public String toString() {
        return numerateur + "/" + denominateur;
    }
    @Override
public int intValue() {
    return (int) doubleValue();
}

@Override
public long longValue() {
    return (long) doubleValue();
}

@Override
public float floatValue() {
    return (float) doubleValue();
}


}