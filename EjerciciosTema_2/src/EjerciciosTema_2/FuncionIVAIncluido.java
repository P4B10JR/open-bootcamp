package EjerciciosTema_2;

import java.util.Scanner;

public class FuncionIVAIncluido {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double precioCompra, iva;

        System.out.println("Ingrese el precio de la compra: ");
        precioCompra = lector.nextDouble();

        iva = obterIva(precioCompra);

        double resultado = obterIva(precioCompra);

        System.out.println("El precio total sin IVA es de: " + precioCompra);
        System.out.println("El precio total (con IVA incluido) es de: " + (precioCompra + iva));

    }

    private static double obterIva(double precioCompra) {
        double iva;
        iva = precioCompra * 0.22;
        return iva;
    }

}
