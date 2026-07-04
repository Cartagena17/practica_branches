package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected String numeroChasis;

    private final Transmision transmision;
    private final Motor motor;

    public Vehiculo(String marca, String modelo, int anio, String numeroChasis, String tipoTransmision, Integer cantidadVelocidades, String tipoMotor, String VIN) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroChasis = numeroChasis;
        this.transmision = new Transmision(tipoTransmision, cantidadVelocidades);
        this.motor = new Motor(tipoMotor, VIN);
    }

    public abstract void arrancar();

    public abstract  void apagar();

}
