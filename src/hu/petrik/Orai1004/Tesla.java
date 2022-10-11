package hu.petrik.Orai1004;
import java.util.Random;

public class Tesla implements Auto{

    private double sebesseg;
    Random rnd = new Random();

    public Tesla() {
        this.sebesseg = rnd.nextDouble() * 61;
    }

    @Override
    public void gyorsul() {
        this.sebesseg = sebesseg + rnd.nextDouble() * 11 + 5;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
