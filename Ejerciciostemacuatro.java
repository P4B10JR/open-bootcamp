public class Ejerciciostemacuatro {

    public static void main(String[] args) {

        int numeroIf = -4;

        if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else {
            System.out.println("El numero es " + numeroIf);
        }


        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = -3;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < -3);



        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }


        var estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Estoy en default");
        }

    }
}