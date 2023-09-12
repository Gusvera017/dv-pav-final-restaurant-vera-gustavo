import domain.Consumible;
import domain.Plato;
import domain.Bebida;
import domain.Menu;

public class Main {
    public static void main(String[] args) {

        // Probando la clase plato:
        Plato platoPrueba = new Plato("Pastas", 2000.00, "Fideos con tuco", false, false);
        System.out.println(platoPrueba);
        // -------------------------------------------

        // Probando la clase bebida:
        Bebida bebidaPrueba = new Bebida("Coca Cola", 600.00, 500, false);
        System.out.println(bebidaPrueba);
        // -------------------------------------------

    }
}