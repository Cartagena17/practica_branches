package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private int idViaje;
    private String origen;
    private String destino;
    private double costo;
    private Conductor conductor;
    private Vehiculo vehiculo;
    private List<Pasajero> listPasajero = new ArrayList<>();


    public Viaje(int idViaje, String origen, String destino, double costo, Conductor conductor, Vehiculo vehiculo) {
        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
    }

    public void agregarPasajeros(Pasajero p){
        this.listPasajero.add(p);
    }
    public void agregarConductor(Conductor c){
        System.out.println("Conductor agregado");
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "idViaje=" + idViaje +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", costo=" + costo +
                ", conductor=" + conductor +
                ", vehiculo=" + vehiculo +
                ", listPasajero=" + listPasajero +
                '}';
    }
}
