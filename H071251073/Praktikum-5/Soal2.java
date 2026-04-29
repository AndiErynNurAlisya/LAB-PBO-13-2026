import java.util.Scanner;

abstract class PerangkatElektronik {
    protected String merk;
    protected int dayaListrik;

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi();

    public void infoPower() {
        System.out.println("Perangkat menyedot daya: " + dayaListrik + " Watt");
    }
}

interface InteraksiInternet {
    void hubungkanWiFi();
}

interface KontrolSuara {
    void prosesPerintah(String perintah);
}

class SmartLamp extends PerangkatElektronik implements KontrolSuara {

    public SmartLamp(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Lampu pintar siap digunakan");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar!");
        } else {
            System.out.println("Perintah tidak dikenali");
        }
    }
}

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {

    public SmartCCTV(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("CCTV sedang memantau...");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {

    public SmartSpeaker(String merk, int daya) {
        super(merk, daya);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Speaker pintar siap digunakan");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Speaker terhubung ke WiFi");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println("Memproses perintah: " + perintah);
    }
}

public class Soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SMART LAMP ===");
        SmartLamp lampu = new SmartLamp("Philips", 10);

        lampu.cekFungsi();

        System.out.print("Masukkan perintah: ");
        String perintahLampu = input.nextLine();

        lampu.prosesPerintah(perintahLampu);
        lampu.infoPower();

        System.out.println();

        System.out.println("=== SMART CCTV ===");
        SmartCCTV cctv = new SmartCCTV("Xiaomi", 20);

        cctv.cekFungsi();
        cctv.hubungkanWiFi();
        cctv.infoPower();

        System.out.println();

        System.out.println("=== SMART SPEAKER ===");
        SmartSpeaker speaker = new SmartSpeaker("Google", 15);

        speaker.cekFungsi();
        speaker.hubungkanWiFi();

        System.out.print("Masukkan perintah untuk speaker: ");
        String perintahSpeaker = input.nextLine();

        speaker.prosesPerintah(perintahSpeaker);
        speaker.infoPower();

        input.close();
    }
}