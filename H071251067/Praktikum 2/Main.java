public class Main {
    public static void main(String[] args) {
        Kelereng k1 = new Kelereng("biasa");
        Kelereng k2 = new Kelereng("biasa");
        Kelereng k3 = new Kelereng();
        Pemain p1 = new Pemain("Adit", 5, k1);
        Pemain p2 = new Pemain("Rian", 5, k2);
        Pemain p3 = new Pemain();


        p1.tembak(p2);
        p1.tembak(p3);
        p2.status();
    }
}
