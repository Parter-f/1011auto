package hu.petrik.Orai1004;

public class Porsche implements Auto{

    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
    sebesseg = sebesseg + 10;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
