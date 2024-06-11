package MarketAlisverisProgram;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Urunler.urunAd.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
        Urunler.urunFiyat.addAll(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
        UrunListe.urunleriYazdir();
        Urunler.alisveriseBasla();







    }
}
