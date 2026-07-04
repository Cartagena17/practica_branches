package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

public class Camion extends  Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int anio, String numeroChasis, String tipoTransmision, Integer cantidadVelocidades, String tipoMotor, String VIN, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, anio, numeroChasis, tipoTransmision, cantidadVelocidades, tipoMotor, VIN);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public void arrancar(){
        System.out.println("Arranca camion");
    }

    public void apagar(){
        System.out.println("C apaga camion");
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroChasis='" + numeroChasis + '\'' +
                '}';
    }
}
