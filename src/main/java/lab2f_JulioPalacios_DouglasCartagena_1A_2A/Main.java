package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Pasajero pasajero1 = new Pasajero("Douglas","12345678-9", LocalDate.of(2008,12,15),"Douglas@gmail","Efectivo");
        Pasajero pasajero2 = new Pasajero("Arturo", "12313149-0",LocalDate.of(2009,3,10),"Arturo@Gmail","Tarjeta debito");

        Conductor conductor1 = new Conductor("Julio","98765432-1",LocalDate.of(2008,8,29),"Julio@Gmail","DSA712387A","Liviana");
        Motocicleta Yamaha = new Motocicleta("Yamaha", "YamahaVespa",2010, "ASD9AY12","Manual",3,"V8","DAS9812",false,"Recto");
        Camion tata = new Camion("tata","Ultra t9",2010,"ASD9YE1","Automatica",4,"V7","7123HA",400.67,2);
        Auto kia = new Auto("Kia","Soul",2008,"DSA9YHU","Automatica",5,"V7","AD721HU",4,true);
        Viaje viaje = new Viaje(67,"Ricaldone","Metrocentro",5.75,conductor1, kia);
        Viaje viaje1 = new Viaje(76, "Metrocentro","Ricaldone",6.00,conductor1,kia);


        viaje.agregarPasajeros(pasajero1);
        viaje.agregarPasajeros(pasajero2);
        viaje.agregarConductor(conductor1);

        Yamaha.arrancar();
        Yamaha.apagar();

        tata.arrancar();
        tata.apagar();

        kia.arrancar();
        kia.apagar();

        conductor1.conducir();



        System.out.println(pasajero1);
        System.out.println(conductor1);
        System.out.println(Yamaha);
        System.out.println(tata);
        System.out.println(kia);
        System.out.println(viaje);
        System.out.println(viaje1);



    }
}