package Fabrika;

public class BUstaBasi extends CPersonelSefi{

    protected int saatucreti=12;
    protected int gunlukCailismaSaati=8;
    protected int aylikKullanacagiIzinSaati;

    protected void sigorta(){
        System.out.println("Tum calisanlar sigortalidir");
    }
    protected void yillikTatil(){
        System.out.println("Tum calisanlarimiz yilda en fazla 20 gun izin kullanabilir");
    }


}
