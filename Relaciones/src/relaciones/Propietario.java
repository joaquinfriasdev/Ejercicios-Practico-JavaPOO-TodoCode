
package relaciones;


public class Propietario {
    
    private Long idLong;
    private String nombre;
    private String apellido;

    public Propietario() {
    }

    @Override
    public String toString() {
        return "Propietario{" + "idLong=" + idLong + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public Propietario(Long idLong, String nombre, String apellido) {
        this.idLong = idLong;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getIdLong() {
        return idLong;
    }

    public void setIdLong(Long idLong) {
        this.idLong = idLong;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
