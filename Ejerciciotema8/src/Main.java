public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(36);
        persona.setNombre("Pablo");
        persona.setTelefono(12345678);

        System.out.println("La edad de Persona es: " + persona.getEdad());
        System.out.println("El nombre de Persona es: " + persona.getNombre());
        System.out.println("El telefono de Persona es: " + persona.getTelefono());

    }
}