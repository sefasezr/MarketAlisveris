package MarketAlisverisProgram;

import java.util.ArrayList;
import java.util.List;

public class Urunler {

    public static List<String> urunAd = new ArrayList<>();
    public static List<Double> urunFiyat  = new ArrayList<>();
    public static double kg;
    public static String secenek;




    public static void alisveriseBasla(){
        System.out.println("Almak istediginizi urunun numarasini giriniz");
        int no = App.scan.nextInt();
        urunKontrol(no);
        tamamDevam();
    }

    public static void urunKontrol(int no){
        switch (no){
            case 0:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 1:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 2:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 3:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 4:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 5:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 6:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 7:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 8:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 9:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            case 10:
                System.out.println("Kac kg almak istiyorsunuz");
                kg = App.scan.nextDouble();
                Sepet.sepeteEkle(no,kg);
                break;
            default:
                System.out.println("Gecerli urun no giriniz");
                alisveriseBasla();
        }

    }
    public static void tamamDevam(){
        System.out.println("Başka bir ürün almak istiyor musunuz? evet/hayir");
        secenek = App.scan.next();
        if (secenek.equalsIgnoreCase("evet")){
            alisveriseBasla();
        }else if (secenek.equalsIgnoreCase("hayir")){
            System.out.println("Alisverisiniz tamamlandi... \nTutarınız hesaplanıyor...");
            Sepet.hesapGoster();

        }else{
            System.out.println("Gecersiz tercih girisi lutfen evet/hayir olarak seciniz");
            tamamDevam();
        }
    }




}
