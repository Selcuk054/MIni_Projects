package Car;

import Car.Car;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();


        car1.setModel("Fiesta");
        car1.setMerk ("Ford");
        car1.setCarrosserie("Sedan");
        car1.setBrandstof("Hybride");
        car1.setBouwjaar(2020);
        car1.setPrijs(7000);
        car1.duers=4;
        car1.kleur="Groen";
        car1.kilometer=200050;


        car1.start();
        //Private
        System.out.println("Arabanin modeli ;"+ car1.getModel());
        System.out.println("Arabanin markasi ;"+ car1.getMerk());
        System.out.println("Arabanin Karoseri ;"+ car1.getCarrosserie());
        System.out.println("Arabanin atesleme tipi ;"+ car1.getBrandstof());
        System.out.println("Arabanin yasi ;"+ car1.getBouwjaar());
        System.out.println("Arabanin fiyati ;"+ car1.getPrijs());
        //Public
        System.out.println("Arabanin kapi sayisi :"+ car1.duers);
        System.out.println("Arabanin rengi : "+ car1.kleur);
        System.out.println("Arabanin kilometresi : "+ car1.kilometer);
        car1.stop();
//bu bizim ilk colobration.Allah nazarlardan saklasın




    }
}