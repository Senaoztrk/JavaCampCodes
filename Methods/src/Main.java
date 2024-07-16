//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Java'da fonksiyon isimleri CamelCase metoduyla yazılır.
    public static void main(String[] args) {

        mesajVer("Senanur");
        System.out.println(topla(4,6));
        System.out.println(toplananİkiSayininYuzdesi(4,6));



    }

    public static void hesapla()
    {
        System.out.println("Hesaplandı");

    }
    public static void mesajVer(String isim)
    {
        System.out.println("Merhaba "+isim);
    }

    public static int topla(int sayi1,int sayi2)
    {
        int toplam=sayi1+sayi2;
        return toplam;

    }
    public static double toplananİkiSayininYuzdesi(int sayi1,int sayi2)
    {
        int toplam=topla(sayi1,sayi2);
        double yuzde=toplam*10/100;
        return yuzde;

    }

    //void fonksiyonlarda değer bulunur ve sonucu yazdırır, bir başka
    //fonksiyonda onu kullanacağımız zaman bir int,String'e atayamıyoruz
    //o yüzden de void yerine int String vb. değişkenlerle fonk oluşturuyoruz gerektiğinde
    //ki değer döndürsün (return)->genelde bir hesaplama için kullanılır
}