//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[]sayilar=new int[]{1,2,3};

        product product1=new product();
        product1.setName("Laptop");

        product product2=new product();
        product2.setName("Mouse");

        product[]urunler=new product[]{product1,product2};

        for(int i=0;i<urunler.length;i++)
        {
            System.out.println(urunler[i].getName());
        }


    }
}