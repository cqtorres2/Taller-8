public class Vehiculo {
    String Marca;
    int velocidadMaxima;

    public void Mostrar() {
        System.out.println("El coche es de la marca: " + Marca + " cuenta con " + velocidadMaxima
                + " caballos de fuerza");
    }

    public class Coche extends Vehiculo {
        int numerodePuertas;

        public Coche(String marca, int velocidadMaxima, int numerodePuertas) {
            this.Marca = marca;
            this.velocidadMaxima = velocidadMaxima;
            this.numerodePuertas = numerodePuertas;
        }

        @Override
        public String toString() {
            return "El Coche registrado posee una marca de nombre: " + Marca + " Con una velocidad maxima de "
                    + velocidadMaxima + " caballos de fuerza y " + numerodePuertas + " puertas";
        }

    }
}
