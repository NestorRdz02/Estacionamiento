package Estacionamiento;

public class Tarjeta extends Usuario {
    private int id;

    public Tarjeta(String nombre, String dirección, String Telefono, String rfc, int id) {
        super(nombre, dirección, Telefono, rfc);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nId: " + getId();
    }

}
