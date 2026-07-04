package lab2f_JulioPalacios_DouglasCartagena_1A_2A;

import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected LocalDate fechaNacimiento;
    protected String correoElectronico;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento, String correoElectronico) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
    }
}
