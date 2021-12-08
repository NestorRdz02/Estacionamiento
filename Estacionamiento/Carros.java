package Estacionamiento;

import java.time.LocalDateTime;

public class Carros {
    private int entrada;
    private int salida;
    private float precioH;
    private Tarjeta tarjeta;

    public Carros(int entrada, int salida, float precioH, Tarjeta tarjeta, LocalDateTime horaActual, int h) {
        this.entrada = entrada;
        this.salida = salida;
        this.precioH = precioH;
        this.tarjeta = tarjeta;
    }

    public int getEntrada() {
        return this.entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return this.salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public float getPrecioH() {
        return this.precioH;
    }

    public void setPrecioH(float precioH) {
        this.precioH = precioH;
    }

    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    private String gethoraActual() {
        return null;
    }

    @Override
    public String toString() {
        return "Hora Actual: " + gethoraActual();
    }

}
