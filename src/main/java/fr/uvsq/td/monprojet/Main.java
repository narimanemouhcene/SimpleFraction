package fr.uvsq.td.monprojet;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Mon projet fonctionne !");
        Fraction f = new Fraction();
        System.out.println(f);
        Fraction f1 = new Fraction(1, 2);
        assert f1.toString().equals("1/2");

        Fraction f2 = new Fraction(5);
        assert f2.toString().equals("5/1");

        Fraction f3 = new Fraction();
        assert f3.toString().equals("0/1");
        System.out.println("Tous les tests sont passés !");
        Fraction f4 = new Fraction(1, 2);
assert f4.doubleValue() == 0.5;

Fraction f5 = new Fraction(5);
assert f5.doubleValue() == 5.0;

Fraction f6 = new Fraction();
assert f6.doubleValue() == 0.0;

System.out.println("Tests de doubleValue() réussis !");
Fraction f7 = new Fraction(1, 2);   // 1/2
Fraction f8 = new Fraction(1, 3);   // 1/3
Fraction somme = f7.add(f8);        // (1/2 + 1/3) = 5/6
assert somme.toString().equals("5/6");

Fraction f9 = new Fraction(2, 5);
Fraction f10 = new Fraction(3, 5);
Fraction somme2 = f9.add(f10);       // (2/5 + 3/5) = 5/5
assert somme2.toString().equals("5/5");

System.out.println("Addition ok !");
    }
}
