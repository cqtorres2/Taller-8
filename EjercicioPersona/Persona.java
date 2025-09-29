public class Persona {
    String nombre;
    int edad = 15;

    public void Detalles() {
        System.out.println("El estudiante de nombre: " + nombre + " cuenta con " + edad
                + " años de edad");
    }

    public class estudiante extends Persona {
        String matricula;

        public estudiante(String nombre, String matricula, int edad){
            this.edad = edad;
            this.nombre = nombre;
            this.matricula = matricula;
        }

        @Override
        public void Detalles() {
            System.out.println("El estudiante de nombre: " + nombre + " cuenta con " + edad
                    + " años de edad y su matricula se encuentra en estado " + matricula);
        }

        @Override
        public String toString() {
            return "El estudiante de nombre: " + nombre + " cuenta con " + edad
                    + " años de edad y su matricula se encuentra en estado " + matricula;
        }
    }
}
