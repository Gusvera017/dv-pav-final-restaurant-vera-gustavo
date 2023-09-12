package domain;
import java.util.Date;
import java.util.List;

public class Mozo extends Empleado {
    private List<Mesa> mesas;

    public Mozo (String nombre, Integer numeroLegajo, Date fechaIngreso) {
        super(nombre, numeroLegajo, fechaIngreso);
        this.mesas = mesas;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    @Override
    public String toString() {
        return "Mozo [" +
                "nombre: " + getNombre() +
                ", numeroLegajo: " + getNumeroLegajo() +
                ", nombre: " + getFechaIngreso() +
                ", mesas: " + mesas +
                '}';
    }
}
