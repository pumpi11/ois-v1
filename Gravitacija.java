public class Gravitacija{
    public static void main(String[] args) {
    System.out.println("OIS je zakon!");
    }

    public double pospesek(double visina) {

        double pospesek = 0;
        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);
        double v = visina;

        pospesek = (C * M) / ((r + v) * (r + v));
        return pospesek;
    }
}