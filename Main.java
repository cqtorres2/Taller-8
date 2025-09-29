public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Persona persona = new Persona();
        Vehiculo vechiculo = new Vehiculo();

        Empleado.Gerente emp1 = empleado.new Gerente("Boliva", "rube", 34);
        Persona.estudiante per1 = persona.new estudiante("Lucas", "Admitido", 15);
        Vehiculo.Coche coh1 = vechiculo.new Coche("Chevrolet", 45, 4);

        System.out.println(emp1);
        System.out.println(per1);
        System.out.println(coh1);
    }
}
