package hu.petrik.Orai1004;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Auto> autok = new ArrayList<>();

    public static void main(String[] args) {

    Porsche p1 = new Porsche(100);
    Porsche p2 = new Porsche(110);
    Porsche p3 = new Porsche(150);
    Tesla t1 = new Tesla();
    Tesla t2 = new Tesla();
    Tesla t3 = new Tesla();


        System.out.println(t3.getSebesseg());
    t3.gyorsul();
        System.out.println(t3.getSebesseg());

        System.out.println(p1.getSebesseg());
    p1.gyorsul();
        System.out.println(p1.getSebesseg());

        System.out.println();

        

    }
}
