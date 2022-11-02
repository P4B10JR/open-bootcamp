package EntregaEjerciciosTema3;

public class ForEach {

    public static void main(String[] args) {

        String[] nombres = { "Pepe", "Juanito", "Ruperta", "Luna"};

        String conc = "";
        for (String nombre : nombres) {
            conc += nombre;
            System.out.println(conc);
        }


    }
}
