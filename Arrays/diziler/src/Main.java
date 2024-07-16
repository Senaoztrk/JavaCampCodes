//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] sehirler1= new String[]{"Ankara","İstanbul","Yalova"};

        //1. yazdırma yöntemi -> c#'da karşılığı "foreach"
        for(String sehir: sehirler1)
        {
            System.out.println(sehir);
        }

        //2. yazdırma yöntemi
        for(int i=0;i<3;i++)
        {
            System.out.println(sehirler1[i]);
        }

    }
}