public class Main2 {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp("Philips Hue", 10);
        SmartCCTV cctv = new SmartCCTV("Hikvision", 15);
        SmartSpeaker speaker = new SmartSpeaker("Google Nest", 30);

        System.out.println("=== Smart Lamp ===");
        lamp.cekFungsi();
        lamp.infoPower();
        lamp.prosesPerintah("NYALA");
        // lamp.hubungkanWiFi(); // ERROR - SmartLamp tidak punya fitur WiFi

        System.out.println();
        System.out.println("=== Smart CCTV ===");
        cctv.cekFungsi();
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println();
        System.out.println("=== Smart Speaker ===");
        speaker.cekFungsi();              // dari abstract class
        speaker.infoPower();              // method konkrit abstract class
        speaker.hubungkanWiFi();          // dari InteraksiInternet
        speaker.prosesPerintah("PLAY");   // dari KontrolSuara
    }
}