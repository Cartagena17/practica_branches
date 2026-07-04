package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

public class Motocicleta extends Vehiculo {
    private boolean sideCar;
    private String tipoManubrio;

    public Motocicleta(String marca, String modelo, int anio, String numeroChasis, String tipoTransmision, Integer cantidadVelocidades, String tipoMotor, String VIN, boolean sideCar, String tipoManubrio) {
        super(marca, modelo, anio, numeroChasis, tipoTransmision, cantidadVelocidades, tipoMotor, VIN);
        this.sideCar = sideCar;
        this.tipoManubrio = tipoManubrio;
    }

    public void arrancar(){
        System.out.println("Arranca moto");
    }

    public void apagar(){
        System.out.println("C apaga la moto");
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "sideCar=" + sideCar +
                ", tipoManubrio='" + tipoManubrio + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroChasis='" + numeroChasis + '\'' +
                '}';
    }
}
