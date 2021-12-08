package Estacionamiento;

import java.util.ArrayList;

public class Estacionamiento {
    private float ph;
    private ArrayList<Carros> carrosEstacionados;
    private ArrayList<Tarjeta> tarjetasRegistradas;

    public Estacionamiento(float ph, ArrayList<Carros> carrosEstacionados, ArrayList<Tarjeta> tarjetasRegistradas) {
        this.ph = ph;
        this.carrosEstacionados = new ArrayList<>();
        this.tarjetasRegistradas = new ArrayList<>();
    }

    public float getPh() {
        return this.ph;
    }

    public void setPh(float ph) {
        this.ph = ph;
    }

    public ArrayList<Carros> getCarrosEstacionados() {
        return this.carrosEstacionados;
    }

    public void setCarrosEstacionados(ArrayList<Carros> carrosEstacionados) {
        this.carrosEstacionados = carrosEstacionados;
    }

    public ArrayList<Tarjeta> getTarjetasRegistradas() {
        return this.tarjetasRegistradas;
    }

    public void setTarjetasRegistradas(ArrayList<Tarjeta> tarjetasRegistradas) {
        this.tarjetasRegistradas = tarjetasRegistradas;
    }
    
}
