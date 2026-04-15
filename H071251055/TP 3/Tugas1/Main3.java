public class Main3 {
    public static void main(String[] args) {
        Dompet dompet1 = new Dompet("123456",1000,"082347777273","Ganteng");
        System.out.println(dompet1.getNama());
        dompet1.setPin("123476", "654321");
        dompet1.setPin("123456", "654321");
        dompet1.setorTunai(100000);
        dompet1.setorTunai(-1000);
        dompet1.tarikTunai("147258", 10000);
        dompet1.tarikTunai("654321", 10000);
        System.out.println(dompet1.getSaldo());
        dompet1.getInvestasi("654321", 1000);
        dompet1.cuan();
    }
}
