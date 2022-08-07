package JavaDersNotlari;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class OgrenciIsimleri {
    public static void main(String[] args) {

    String [] isimler={"Adem","Emsal","Ayşe","Yasemin","Gülşah","Hüseyin","Birol","Cihan","Hatice","Selim"};
    int [][]vizeFinalNotlari={{65,85},{75,90},{92,55},{68,72},{68,75},{75,55},{85,90},{65,56},{55,88},{72,86}};
    int [] projeNotu={100,50,0,50,68,78,85,90,98,100};
    double ortToplami=0;
    List<Double> butunlemeNotlari=new ArrayList<>();
    List<Double> notOrtalamalari=new ArrayList<>();




        System.out.println("   JAVA BATCH 81'IN NOT LISTESI");
        System.out.println("ADI      Vize   Final   Proje    ORT");

        for (int i = 0; i < projeNotu.length ; i++) {

        System.out.print(isimler[i]);
        System.out.print("\t  "+vizeFinalNotlari[i][0]);
        System.out.print("     "+vizeFinalNotlari[i][1]);
        System.out.print("     "+projeNotu[i]);
        System.out.println("\t     "+new DecimalFormat("##.##").format(((vizeFinalNotlari[i][0]*0.3)+(vizeFinalNotlari[i][1]*0.5)+(projeNotu[i]*0.2))));
        notOrtalamalari.add((vizeFinalNotlari[i][0]*0.3)+(vizeFinalNotlari[i][1]*0.5)+(projeNotu[i]*0.2));
        ortToplami+=(vizeFinalNotlari[i][0]*0.3)+((vizeFinalNotlari[i][1]*0.5)+(projeNotu[i]*0.2));
        }
        System.out.println("Batch 81 Sinifinin agirlikli not ortalamasi :"+(new DecimalFormat("##.##").format(ortToplami/ projeNotu.length)));
        notOrtalamalari.size();


        System.out.println(butunlemeNotlari);
        System.out.println("notOrtalamalari = " + notOrtalamalari);





}
}