package SmartDevice;

import SmartDevice.OtherDevices.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartWatch smartWatch = new SmartWatch("Seiko", "LT32", "Negro", 00, 00, 00, 01);

        System.out.println(smartWatch.marca);
        System.out.println(smartWatch.modelo);
        System.out.println(smartWatch.color);
        System.out.println(smartWatch.hora);
        System.out.println(smartWatch.minutos);
        System.out.println(smartWatch.segundos);
        System.out.println(smartWatch.dia);
    }
}
