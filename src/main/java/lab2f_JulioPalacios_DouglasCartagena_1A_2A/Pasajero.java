package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

import java.time.LocalDate;

public class Pasajero extends  Persona{
    private String metodoPagoPredeterminado;

    public Pasajero(String nombre, String dni, LocalDate fechaNacimiento, String correoElectronico, String metodoPagoPredeterminado) {
        super(nombre, dni, fechaNacimiento, correoElectronico);
        this.metodoPagoPredeterminado = metodoPagoPredeterminado;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "metodoPagoPredeterminado='" + metodoPagoPredeterminado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
