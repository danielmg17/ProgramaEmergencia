
package Modelos;

/**
 *
 * @author danie
 */
public class Pacientes implements Comparable<Pacientes> {
    String apellidos;
    String nombre;
    String telefono;
    int gravedad;

    public Pacientes(String apellidos, String nombre, String telefono, int gravedad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
        this.gravedad = gravedad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }    

    @Override
    public int compareTo(Pacientes o) {
        return o.gravedad < this.gravedad ? 1: -1;
    }
}
