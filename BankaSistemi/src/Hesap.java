import java.io.*;
import java.util.InputMismatchException;

public class Hesap {

    String musteriadi;
    int hesapno;
    double bakiye;


    public Hesap(String musteriadi,int hesapno, double bakiye) throws InputMismatchException {

        try {

            this.musteriadi = musteriadi;
            this.hesapno = hesapno;
            this.bakiye = bakiye;

            if (bakiye < 0) throw new Exception("Bakiyeniz negatif olamaz.");
        }catch(InputMismatchException e){

            System.out.println("Geçersiz giriş"+e);
            System.exit(0);
        }
        catch (Exception e){


            System.out.println("Alınan Exception hatası:"+e);

            System.exit(0);
        }

    }

    public void parayatir(){

        System.out.println("Yatırmak istediğiniz miktar: ");
        double miktar = Test.scanner.nextDouble();

        double guncelbakiye = bakiye+miktar;

        System.out.println("Güncel bakiyeniz: "+guncelbakiye);


    }

    public void paracek(){

        System.out.println("Çekmek istediğiniz miktar:");


        double tutar = Test.scanner.nextDouble();

        if(tutar<=bakiye) {

            System.out.println("İstediğiniz tutar çekildi.");
            double guncelbakiye = bakiye - tutar;

            System.out.println("Güncel bakiyeniz: " + guncelbakiye);
        }
        else {

            System.out.println("Yetersiz bakiye...");
            System.out.println("Mevcut Bakiyeniz: "+bakiye);


        }
    }

    public void bakiyegoruntule() {

        System.out.println("Mevcut Bakiyeniz: " + bakiye);


    }
}
