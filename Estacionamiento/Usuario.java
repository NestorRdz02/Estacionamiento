package Estacionamiento;

public class Usuario {
    private String nombre;
    private String dirección;
    private String Telefono;
    private String rfc;

    public Usuario(String nombre, String dirección, String Telefono, String rfc) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.Telefono = Telefono;
        this.rfc = rfc;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        String Datos = "Nombre: " + getNombre() +
                "\nDirección: " + getDirección() +
                "\nTelefono: " + getTelefono() +
                "\nRFC: " + getRfc();
        return Datos;
    }

}
