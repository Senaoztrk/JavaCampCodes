//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sayi = 3;
        boolean varMi = sayibul(sayilar, sayi);
        mesajVer(varMi, sayi);
    }

    public static void mesajVer(boolean varMi, int sayi) {
        String mesaj;
        if (varMi) {
            mesaj = "Sayı mevcut: " + sayi;
            System.out.println(mesaj);
        } else {
            mesaj = "Sayı mevcut değil: " + sayi;
            System.out.println(mesaj);
        }
    }

    public static boolean sayibul(int arr[], int sayi) {
        for (int say : arr) {
            if (say == sayi) {
                return true; // Eğer sayı bulunursa true döner
            }
        }
        return false; // Eğer sayı bulunamazsa false döner
    }
}
