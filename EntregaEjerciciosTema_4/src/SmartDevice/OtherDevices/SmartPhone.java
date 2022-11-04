package SmartDevice.OtherDevices;

import SmartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {

    String tipoPantalla;
    String espacioMemoria;
    String tipoAntena;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, String tipoPantalla, String espacioMemoria, String tipoAntena) {
        super(marca, modelo, color);
        this.tipoPantalla = tipoPantalla;
        this.espacioMemoria = espacioMemoria;
        this.tipoAntena = tipoAntena;
    }
}
