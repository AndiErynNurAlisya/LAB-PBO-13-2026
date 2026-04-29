public class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {

    public SmartSpeaker(String merk, double dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println(merk + ": SmartSpeaker siap memutar audio.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println(merk + ": Terhubung ke WiFi, siap streaming.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println(merk + " menerima perintah suara: \"" + perintah + "\"");
    }
}