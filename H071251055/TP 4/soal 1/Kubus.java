public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== KUBUS ===");
        super.tampilkan();
    }
}
