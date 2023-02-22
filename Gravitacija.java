import java.util.*;
public class Gravitacija{
    public static void main(String[] args) {
    Scanner vhod = new Scanner(System.in);
	double visina = vhod.nextDouble();
	
	System.out.println("Nadmorska višina: " + visina);
	System.out.println("Gravitacijski pospešek: " + pospesek(visina));
    }

    static public double pospesek(double visina) {

        double pospesek = 0.0;
        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);
        double v = visina;

        pospesek = (C * M) / ((r + v) * (r + v));
        return pospesek;
    }
}