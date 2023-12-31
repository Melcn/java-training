package easy.poo;

public class Rational {

    private int numerator;
    private int denominateur;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(int denominateur) {
        if(denominateur == 0){
            throw new RuntimeException( "denominator cannot be null ");
        }
        this.denominateur = denominateur;
    }
}
