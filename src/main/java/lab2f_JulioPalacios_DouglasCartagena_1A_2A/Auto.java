package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

public class Auto  extends Vehiculo{
    private int numeroPuertas;
    private boolean techoSolar;

    public Auto(String marca, String modelo, int anio, String numeroChasis, String tipoTransmision, Integer cantidadVelocidades, String tipoMotor, String VIN, int numeroPuertas, boolean techoSolar) {
        super(marca, modelo, anio, numeroChasis, tipoTransmision, cantidadVelocidades, tipoMotor, VIN);
        this.numeroPuertas = numeroPuertas;
        this.techoSolar = techoSolar;
    }

    public void arrancar(){
        System.out.println("BRRUM BRRUM");
    }

    public void apagar(){
        System.out.println("Apagar");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numeroPuertas=" + numeroPuertas +
                ", techoSolar=" + techoSolar +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroChasis='" + numeroChasis + '\'' +
                '}';
    }
}
