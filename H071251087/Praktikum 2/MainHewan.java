public class MainHewan {
    public static void main(String[] args) {
        Pemilik P1 = new Pemilik("Joe", "Magelang");
        Pemilik P2 = new Pemilik("Shanesia", "Makassar");

        Hewan kucing = new Hewan("Moko", 2, P1);
        Hewan burung = new Hewan("Sora", 3, P2);

        kucing.bersuara("Meooongggg!");
        burung.bersuara("Ciittt Ciittt!");

        kucing.bandingkanUmur(burung);
    }
}