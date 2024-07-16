//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        String urun="Laptop";
        for(int sayac=1;sayac<10;sayac++)
        {
            System.out.println(urun+ sayac);
        }

        int sayi=10;
        while(sayi<=100)
        {
            System.out.println(sayi);
            sayi+=10;
        }

        int sayi2=11;
        do {
            System.out.println(sayi2);
            sayi2+=10;
        }while(sayi2>100);
        //do-while da şart sağlanmasa da şarta bakmadan ilk olarak do
        //gerçekleştirildiği için şarta bakılmadan ilk print işlemi yapılır->11





    }
}