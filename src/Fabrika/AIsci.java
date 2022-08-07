package Fabrika;

public class AIsci extends BUstaBasi{

    public static void main(String[] args) {
        AIsci isci1=new AIsci();
        System.out.println(isci1.saatucreti);
        isci1.aylikKullanacagiIzinSaati=24;
        System.out.println("Aylik net maasi :"+ isci1.saatucreti*(isci1.gunlukCailismaSaati * 30 - isci1.aylikKullanacagiIzinSaati));
        isci1.personelCode="002";
        System.out.println(isci1.personelCode);
        isci1.malBildirimi();
    }


}
