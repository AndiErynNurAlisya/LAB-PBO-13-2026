public class Pemain {
    String nama;
    int jumlahKelereng;
    Kelereng kelereng;
    public Pemain() {
        nama = "Pemain";
        jumlahKelereng = 5;
        kelereng = new Kelereng();
    }
    public Pemain(String nama, int jumlahKelereng, Kelereng kelereng) {
        this.nama = nama;
        this.jumlahKelereng = jumlahKelereng;
        this.kelereng = kelereng;
    }
    public void tembak(Pemain lawan) {
        System.out.println(nama + " menembak kelereng " + lawan.nama);
        lawan.jumlahKelereng--;
    }
    public void status() {
        System.out.println(nama + " punya " + jumlahKelereng + " kelereng");
    }
}
