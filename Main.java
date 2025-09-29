public class Main {
    public static void main(String[] args) {
       Empleado empleado = new Empleado();
        Empleado.Gerente emp1 = empleado.new Gerente ("Boliva", "rube", 34);

        System.out.println(emp1);
    }
}
