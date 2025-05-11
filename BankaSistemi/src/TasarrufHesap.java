public class TasarrufHesap extends Hesap {

    static final double faizorani = 0.57;


    public TasarrufHesap(String musteriadi,int hesapno, double bakiye){

        super(musteriadi,hesapno,bakiye);

    }

    public void faizislemi(){

        double guncelbakiye= bakiye+(bakiye*(faizorani/100));

        System.out.println("Güncel bakiyeniz: "+guncelbakiye);

    }



}
