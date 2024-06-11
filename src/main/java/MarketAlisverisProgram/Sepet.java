package MarketAlisverisProgram;

import java.util.ArrayList;
import java.util.List;

public class Sepet extends UrunListe {

    public static List<String> sepettekiUrun = new ArrayList<>();
    public static List<Double> sepettekiFiyat  = new ArrayList<>();
    public static List<Double> sepettekiKg  = new ArrayList<>();
    public static double hesap;
    public static double odenek;
    public static double paraUstu =0;
    public static byte cikis;



    public static void sepeteEkle(int no,double kg){
        sepettekiUrun.add(Urunler.urunAd.get(no));
        sepettekiKg.add(kg);
        sepettekiFiyat.add(kg*Urunler.urunFiyat.get(no));
        sepetiYazdir();
    }

    public static void sepetiYazdir(){
        for(int i = 0; i<sepettekiUrun.size(); i++){
            System.out.println(sepettekiUrun.get(i)+"\t"+sepettekiKg.get(i)+"\t"+sepettekiFiyat.get(i));
            hesap = hesap+sepettekiFiyat.get(i);
        }
    }

    public static void hesapGoster(){
        System.out.println("Odemeniz gereken tutar: "+hesap);
        System.out.println("Alisveristen vazgecmek istiyorsanız (0) tuslayin");
        cikis = App.scan.nextByte();
        if (cikis==0){
            System.out.println("Alisveristen vazgecildi");
            System.exit(0);
        }
        odemeAl();
    }
    public static void odemeAl(){
        System.out.println("Para girisi yapiniz..");
        odenek = App.scan.nextDouble();
        if(odenek>hesap){
            System.out.println("Ödemeniz alindi! \nPara üstü hesaplaniyor...");
            paraUstu = odenek-hesap;
            System.out.println("Para üstünüz: "+paraUstu+"\nİyi günler dileriz...");
        }else if (odenek<hesap){
            System.out.println("Yetersiz bakiye girisi! \neksiğinizi tamamlayin");
            odemeAl();
        }else{
            System.out.println("Odemeniz alindi! \nPara ustunuz : "+paraUstu);
        }
    }


}
