
public class Incorrecto {
    private String a;
    private int b;

    public class Doble {

    }

    public class Error extends Incorrecto extends Doble{
        
        public Error(String a, int b){
            String c;
            this.a = "x";
            this.b = 23;
        }
        
    }
}
