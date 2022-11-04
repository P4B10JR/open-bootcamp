package SmartDevice.OtherDevices;

import SmartDevice.SmartDevice;

public class SmartWatch extends SmartDevice{

    public int hora;
    public int minutos;
    public int segundos;
    public int dia;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, int hora, int minutos, int segundos, int dia) {
        super(marca, modelo, color);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.dia = dia;
    }
}
