import java.util.Scanner;


public class Test {

    static Scanner scanner = new Scanner(System.in);
    public static void islemlerigoster(){

        System.out.println("\t1-Cari Hesap İslemleri");
        System.out.println("\t2-Tasarruf Hesabı İslemleri");
        System.out.println("\t3-Çık");
    }

    public static void cariHesapIslemleri(){

        System.out.println("1)Para Çekme: ");
        System.out.println("2)Para Yatırma: ");
        System.out.println("3)Bakiye Görüntüle: ");
        System.out.println("4)Hesap Kesim İslemi ");

    }
    public static void tasarrufHesapIslemleri(){

        System.out.println("1)Para Çekme: ");
        System.out.println("2)Para Yatırma: ");
        System.out.println("3)Bakiye Görüntüle: ");
        System.out.println("4)Faiz İslemi ");

    }


    public static void main(String[] args) {


        CariHesap cariHesap = new CariHesap("Arda", 751, 30, 1.7);
        TasarrufHesap tasarrufHesap = new TasarrufHesap("Engin", 612, 30);

        System.out.println("****Banka Hesap Yönetim Sistemine Hoşgeldiniz****");

        int islem;

        do {

            islemlerigoster();


            System.out.println("Bir işlem seçiniz: ");


            islem = scanner.nextInt();


            switch (islem) {

                case 1:
                    cariHesapIslemleri();
                    int islem1 = scanner.nextInt();
                    switch (islem1) {

                        case 1:
                            cariHesap.paracek();
                            break;
                        case 2:
                            cariHesap.parayatir();
                            break;
                        case 3:
                            cariHesap.bakiyegoruntule();
                            break;
                        case 4:
                            cariHesap.hesapkesimislemi();
                            break;

                    }


                case 2:
                    tasarrufHesapIslemleri();
                    int islem2 = scanner.nextInt();

                    switch (islem2) {

                        case 1:
                            cariHesap.paracek();
                            break;
                        case 2:
                            cariHesap.parayatir();
                            break;
                        case 3:
                            cariHesap.bakiyegoruntule();
                            break;
                        case 4:
                            tasarrufHesap.faizislemi();
                            break;

                    }
                case 3:
                    System.out.println("Programlamadan çıkılıyor...");
                    break;

            }if (islem != 3 ) {
                System.out.println("Devam için bir tuşa basınız...");
                scanner.nextLine();  // Bu satır, scanner'in doğru çalışmasını sağlamak için eklenmiştir
                scanner.nextLine();  // Kullanıcının bir tuşa basmasını bekler
            }
        }while (islem != 3);
    }
}
//Projelerde referans aldığım websiteleri:
//https://www.udemy.com/course/sifirdan-ileri-seviyeye-komple-java-gelistirici-kursu/learn/lecture/8523082#questions/4960698
//https://nesibeyalcin.wordpress.com/wp-content/uploads/2019/12/11.hafta_.pdf
//https://www.baskent.edu.tr/~tkaracay/etudio/ders/prg/dataStructures/Collections/ClassArrayList01.pdf