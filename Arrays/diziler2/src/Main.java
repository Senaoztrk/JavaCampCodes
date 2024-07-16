//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[]sehirler1=new String[]{"Ankara","İstanbul","İzmir"};
        String[]sehirler2=new String[]{"Antep","Diyarbakır","Urfa"};
        sehirler1=sehirler2;
        sehirler1[0]="Adana";
        System.out.println(sehirler1[0]); //Adana



    }

    //Value types=bool,int,double...
    //Reference types=array,class,abstract,interface...
}