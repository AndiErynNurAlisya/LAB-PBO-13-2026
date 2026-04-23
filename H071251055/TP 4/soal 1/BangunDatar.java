public class BangunDatar extends Bangun {
    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }

    @Override
    public void tampilkan() {
        System.out.println("Luas     : " + String.format("%.2f", luas()));
        System.out.println("Keliling : " + String.format("%.2f", keliling()));
    }
}
