import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        creditManager cManager=new creditManager();
        cManager.add();
        cManager.calculate();

        mortgageManager mManager=new mortgageManager();
        mManager.add();

        creditManager[] credits=new creditManager[2];
        /*ArrayList<creditManager>credits=new ArrayList<creditManager>();
        credits.add(new mortgageManager());
        credits.add(new VehicleManager());
        for(creditManager credit:credits)
        {
         credit.calculate();
         }
        Bu da başka bir array oluşturma ve doldurma yöntemi.
        Import java.util.ArrayList eklemek gerekli.
        */


        credits[0]=new mortgageManager();
        credits[1]=new VehicleManager();

        for(int i=0;i< credits.length;i++)
        {
            credits[i].calculate();
            //Çıktı önce Mortagage sonra da Vehicle'a göre hesaplanır.
            //!!REFERENCE TYPE
        }
    }

    //SOLID ÖNEMLİ!: Yazılıma yeni talep gelirse sizin mevcut
    //kodlarınızın değişmemesi lazım.
}