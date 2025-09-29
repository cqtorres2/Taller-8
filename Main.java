public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Persona persona = new Persona();
        Empleado.Gerente emp1 = empleado.new Gerente("Boliva", "rube", 34);
        Persona.estudiante per1 = persona.new estudiante("Lucas", "Admitido", 15);
        System.out.println(emp1);
        System.out.println(per1);
    }
}
