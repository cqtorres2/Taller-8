public class Empleado {
    String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        String mostrarDetalles = "Nombre: " + nombre
                + " con un salario fijo de " + salario + " actualmente bajo contrato";
    }

    public class Gerente {
        public static String mostrarDetalles;
        String departamento;

        public Gerente(String departamento) {
            this.departamento = departamento;
            String mostrarDetalles = "Nombre: " + nombre
                    + " con un salario fijo de " + salario + " actualmente bajo contrato en el departamento de "
                    + departamento + " En el pais de colombia";
        }
    }

    @Override
    public String toString() {
        return "Los datos son: " + Gerente.mostrarDetalles;
    }
}
