public class BangunRuang extends Bangun {
    public double luasPermukaan() {
        return 0;
    }

    public double volume() {
        return 0;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas Permukaan : " + String.format("%.2f", luasPermukaan()));
        System.out.println("Volume         : " + String.format("%.2f", volume()));
    }
}
