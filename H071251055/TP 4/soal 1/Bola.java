public class Bola extends BangunRuang {
    private double r;

    public Bola(double r) {
        this.r = r;
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== BOLA ===");
        super.tampilkan();
    }
}
