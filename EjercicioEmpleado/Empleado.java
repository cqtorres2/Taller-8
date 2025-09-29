public class Empleado {
    String nombre;
    int salario;

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre
                + " con un salario fijo de " + salario + " actualmente bajo contrato");
    }

    public class Gerente extends Empleado {
        public static String mostrarDetalles;
        String departamento;

        public Gerente(String departamento, String nombre, int salario) {
            this.departamento = departamento;
            this.nombre = nombre;
            this.salario = salario;
        }

        @Override
        public void mostrarDetalles() {
            System.out.println("Nombre: " + nombre
                    + " con un salario fijo de " + salario + " con localidad en el departamento de " + departamento
                    + " y actualmente bajo contrato");
        }

        @Override
        public String toString() {
            return "Los datos son: Nombre: " + nombre
                    + " con un salario fijo de " + salario + " con localidad en el departamento de " + departamento
                    + " y actualmente bajo contrato";
        }
    }

}
