public class Dompet {
    private String pin;
    private double saldo; 
    protected String nomor ;
    String nama ;
    private double investasi;
    
    public Dompet (String pin,double saldo,String nomor,String nama){
        this.pin = pin;
        this.saldo = saldo;
        this.nomor = nomor;
        this.nama = nama;
    }
    public Dompet (double saldo){
        this.saldo = 0;
    }
    public String getNama (){
        return nama ;
    }
    public double getSaldo (){
        return saldo ;
    }

    public void  setPin (String pinLama,String pinBaru ){
        if (pinLama.equals(this.pin) ){
            if (pinBaru.length() != 6){
                logTransaksi("Pin Harus 6 Karakter");
            }else {
                this.pin = pinBaru;
                logTransaksi("Pin Berhasil Terganti:3");
            }
        } else {
            logTransaksi("Pin Salah :(");
        }
    }

    public void setorTunai (double nominal){
        if (nominal > 0) {
            saldo+= nominal;
            logTransaksi("Saldo terkini : " + saldo);
        }else {
            logTransaksi("Setoran Harus Lebih Besar Dari 0"); 
        } 

        }
    public void tarikTunai (String pin,double nominal){
        if (pin.equals(this.pin)){
            if (saldo > nominal){
                saldo-=nominal;
            }
        }
    }
    public void logTransaksi (String pesan){
        System.out.println("[Pesan]: " + pesan);

    }

    public void getInvestasi(String pinInput,double nominalInvest) {
        if (pinInput.equals(this.pin)) {
            if (saldo > 0) {
                saldo-= nominalInvest ;
                investasi = nominalInvest ;
                logTransaksi("Hasil Invetasi :" + investasi);
                logTransaksi("Sisa Saldo Anda :"+ saldo);
            }else {
                logTransaksi("Saldo Anda Tidak Cukup Untuk Invetasi");

            }
        }else {
            logTransaksi("Pin Yang Anda Masukkan Salah");
        }

    }
    public void cuan () {
        double bunga = investasi * 0.05;
        investasi+= bunga ;
        logTransaksi("Hasil Investasi setelah cuan "+ investasi);
    }
}