

package modelo;

public class municipio {
    private String nombre;
    private String descripcion;
    private String kilometros;
    private String telefono;
    private String fecha;
    private String subregion;

    public municipio(String nombre, String descripcion, String kilometros, String telefono, String fecha, String subregion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.kilometros = kilometros;
        this.telefono = telefono;
        this.fecha = fecha;
        this.subregion = subregion;
    }

    municipio(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getKilometros() {
        return kilometros;
    }

    public void setKilometros(String kilometros) {
        this.kilometros = kilometros;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }
    
}
