import domain.Mesa;
import service.MesaService;

public class MesaHelper {

    public MesaHelper() {

    }

    public static Mesa crearMesax2(MesaService mesaService) {
        return mesaService.crear(2);
    }

    public static Mesa crearMesax4(MesaService mesaService) {
        return mesaService.crear(4);
    }
}
