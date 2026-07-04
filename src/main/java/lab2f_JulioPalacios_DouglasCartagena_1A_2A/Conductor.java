package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

import java.time.LocalDate;

public class Conductor extends  Persona{
    private String numeroLicencia;
    private String tipoLicencia;

    public Conductor(String nombre, String dni, LocalDate fechaNacimiento, String correoElectronico, String numeroLicencia, String tipoLicencia) {

        super(nombre, dni, fechaNacimiento, correoElectronico);
        this.numeroLicencia = numeroLicencia;
        this.tipoLicencia = tipoLicencia;
    }
    public void conducir(){
        System.out.println("CONDUCE lol");
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
