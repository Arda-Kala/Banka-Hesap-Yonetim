public class CariHesap extends Hesap {

    double faizorani = 0.75;

    public CariHesap(String musteriadi, int hesapno, double bakiye, double faizorani) {
        super(musteriadi, hesapno, bakiye);
        this.faizorani = faizorani;
    }

    public double aylikFaizHesapla() {
        return bakiye * faizorani / 100;
    }

    public void hesapkesimislemi(){

        double aylikFaiz = aylikFaizHesapla();
        bakiye += aylikFaiz; // Bakiyeye faizi ekle

        System.out.println("*****Hesap Kesim Bilgileri*****");
        System.out.println("Müsteri adi: "+musteriadi);
        System.out.println("Müsteri Hesap No: "+hesapno);
        System.out.println("Faiz Oranı: " + faizorani);
        System.out.println("Aylık Faiz: " + aylikFaiz);
        System.out.println("Güncellenmiş Bakiye: " + bakiye);

    }







}
