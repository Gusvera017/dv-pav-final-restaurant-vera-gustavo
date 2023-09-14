import domain.*;
import service.MesaService;

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

        // Probando la clase mesa:
        //Mesa mesaPrueba = new Mesa(01, 4, EstadoMesa.OCUPADA);
        //System.out.println(mesaPrueba);
        // -------------------------------------------

        // Probando la clase mesaService:
        MesaService mesaService = new MesaService();
        Mesa mesax2n1 = MesaHelper.crearMesax2(mesaService);
        Mesa mesax2n2 = MesaHelper.crearMesax2(mesaService);
        Mesa mesax2n3 = MesaHelper.crearMesax2(mesaService);
        Mesa mesax4n4 = MesaHelper.crearMesax4(mesaService);
        Mesa mesax4n5 = MesaHelper.crearMesax4(mesaService);
        Mesa mesax4n6 = MesaHelper.crearMesax4(mesaService);
        mesaService.mostrarEstado(mesax2n1);
        mesaService.mostrarEstado(mesax2n2);
        mesaService.mostrarEstado(mesax2n3);
        mesaService.mostrarEstado(mesax4n4);
        mesaService.mostrarEstado(mesax4n5);
        mesaService.mostrarEstado(mesax4n6);
        // -------------------------------------------
    }
}