public class Tabung extends BangunRuang {
    private double r, tinggi;

    public Tabung(double r, double tinggi) {
        this.r      = r;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * r * (r + tinggi);
    }

    @Override
    public double volume() {
        return Math.PI * r * r * tinggi;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== TABUNG ===");
        super.tampilkan();
    }
}
