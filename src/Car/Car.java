package Car;

public class Car {
    //fielsds properties
    public int duers;
    public String kleur;
    public int kilometer;

    private String model;
    private String merk;
    private int prijs;
    private String carrosserie;
    private String brandstof;
    private int bouwjaar;

    public  void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return  this.model;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return this.merk;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getCarrosserie() {
        return carrosserie;
    }

    public void setCarrosserie(String carrosserie) {
        this.carrosserie = carrosserie;
    }

    public String getBrandstof() {
        return brandstof;
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        if (bouwjaar==2020 || bouwjaar==2022){
            this.bouwjaar = bouwjaar;
        }else {
            System.out.println("Bouwjaar sadece 2020 yada 2022 olmali" );
        }
    }
    public void start(){
        System.out.println("Araba Calisti...");
    }
    public void stop(){
        System.out.println("Araba Durdu...");
    }
}
