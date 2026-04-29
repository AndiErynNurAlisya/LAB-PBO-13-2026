public abstract class PerangkatElektronik {
    protected String merk;
    protected double dayaListrik;

    public PerangkatElektronik(String merk, double dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    // Abstract method
    public abstract void cekFungsi();

    // Method konkrit
    public void infoPower() {
        System.out.println(merk + " sedang menyedot daya sebesar " + dayaListrik + " Watt.");
    }
}