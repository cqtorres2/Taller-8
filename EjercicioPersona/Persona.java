public class Persona {
    String nombre;
    int edad = 15;

    public class estudiante extends Persona {
        String matricula;

        @Override
        public String toString() {
            return "El estudiante de nombre: " + nombre + " cuenta con " + edad
                    + " años de edad y su matricula se encuentra en estado " + matricula;
        }
    }
}
