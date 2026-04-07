public class Hewan {
    String nama;
    int umur;
    Pemilik majikan;

    public Hewan() {
        this.nama = "Hewan Liar";
        this.umur = 1;
        this.majikan = new Pemilik("Tidak Ada", "Jalan Raya");
    }

    public Hewan (String nama, int umur, Pemilik majikan) {
        this.nama = nama;
        this.umur = umur;
        this.majikan = majikan;
    }

    public void bersuara(String bunyi) {
        System.out.println(this.nama + " peliharaan " + majikan.namaPemilik + " bersuara " + bunyi);
    }

    public void bandingkanUmur(Hewan hewanLain) {
        System.out.println("\nPerbandingan Umur:");
        if (this.umur > hewanLain.umur) {
            System.out.println(this.nama + " lebih tua dari " + hewanLain.nama);
        } else if (this.umur < hewanLain.umur) {
            System.out.println(this.nama + " lebih muda dari " + hewanLain.nama);
        } else {
            System.out.println(this.nama + " berumur sama dengan " + hewanLain.nama);
        }
    }
}