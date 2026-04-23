class DompetDigital {

    private String pin;
    private double saldo;
    protected String Id;
    //bebas
    String statusAkun;

    //live code
    private double investasi = 0;

    public DompetDigital(String idNasabah, String pin) {
        this.Id = idNasabah;
        this.pin = pin;
        this.saldo = 0;
        this.statusAkun = "Aktif";
    }

    
    public String getIdNasabah() {
        return Id;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getStatusAkun() {
        return statusAkun;
    }

    //live code
    public double getInvestasi(){
        return investasi;
    }

    public void ubahPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            System.out.println("PIN lama salah!");
        } else if (pinBaru.length() != 6) {
            System.out.println("minimal 6 char");
        } else {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah");
        }
    }

    public void setor(double jumlahSetor) {
        if (jumlahSetor <= 0) {
            System.out.println("Nominal setor tdk boleh kurang dan mines");
            logTransaksi("Setor gagal");
        } else {
            saldo += jumlahSetor;
            System.out.println("Setor berhasil: " + jumlahSetor);
            logTransaksi("Setor berhasil");
        }
    }

    public void tarik(double jumlahTarik, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("PIN salah");
            logTransaksi("penarikan gagal, PIN salah");
        } else if (jumlahTarik > saldo) {
            System.out.println("Saldo tidak cukup!");
            logTransaksi("penarikan gagal, saldo kurang");
        } else if (jumlahTarik <= 0) {
            System.out.println("Nominal tidak valid!");
            logTransaksi("penarikan gagal, nominal salah");
        } else {
            saldo -= jumlahTarik;
            System.out.println("penarikan berhasil: " + jumlahTarik);
            logTransaksi("penarikan berhasil");
        }
    }

    private void logTransaksi(String pesan) {
        System.out.println("[LOG]: " + pesan);
    }

    //live code
    public void investasi(double jumlahInvestasi, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("SALAH!!!!");
        } else if (jumlahInvestasi < 0) {
            System.out.println("TIDAK VALID!!!");
        } else if (jumlahInvestasi > saldo) {
            System.out.println("saldo tidak cukup");
        }else {saldo -= jumlahInvestasi;
            investasi += jumlahInvestasi;
            System.out.println("yey berhasil");
        }

    }

    //live code
    public void updateKeuntunganInvestasi() {
        double bunga = 0.05 * investasi;
        investasi += bunga;
        System.out.println("Investasi bertambah (5%):    " + bunga);


    }
}

public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital("001", "123456A");

        //1
        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo: " + dompet.getSaldo());
        System.out.println("Status akun: "  +dompet.getStatusAkun());
        
        //2
        dompet.ubahPin("111111", "654321");

        //3
        dompet.ubahPin("123456", "654321"); 

        //4
        dompet.setor(50000);

        //5
        dompet.setor(-100);

        //6
        System.out.println("equals");
        dompet.tarik(20000, "123456A"); 

        //7
        dompet.tarik(20000, "654321"); 

        //8
        System.out.println("Saldo: " + dompet.getSaldo());

        //live code
        dompet.investasi(10000, "123456A");
        dompet.investasi(10000, "654321");
        dompet.updateKeuntunganInvestasi();

        System.out.println("--- Total Investasi ---");
        System.out.println("Investasi: " + dompet.getInvestasi());
        System.out.println("Saldo sekarang: " + dompet.getSaldo());
        
    }
}
