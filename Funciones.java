public class Funciones {

    public static void main(String[] args) {
       suma(10,5, 5);

       Coche miCoche = new Coche();
       miCoche.incrementarPuertas();
       miCoche.incrementarPuertas();
       System.out.println(miCoche.puertas);
    }


     public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {
    public int puertas = 2;

    public void incrementarPuertas(){
        this.puertas++;
    }
}