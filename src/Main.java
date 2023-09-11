import domain.Plato;
import domain.Bebida;

public class Main {
    public static void main(String[] args) {

        Plato platoPrueba = new Plato("Pastas", 2000.00, "Fideos con tuco", false, false);
        Bebida bebidaPrueba = new Bebida("Coca Cola", 600.00, 500, false);
        System.out.println("Hello world!");

        System.out.println(platoPrueba);
        System.out.println(bebidaPrueba);
    }
}