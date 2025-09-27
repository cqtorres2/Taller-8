public class Vehiculo {
    String Marca;
    int velocidadMaxima;

    public class Coche extends Vehiculo {
        int numerodePuertas;

        @Override
        public String toString() {
            return "El Coche registrado posee una marca de nombre; " + Marca + " Con una velocidad maxima de "
                    + velocidadMaxima + " caballos de fuerza y " + numerodePuertas + " puertas";
        }

    }
}
