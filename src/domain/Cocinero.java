package domain;

import java.util.Date;

public class Cocinero extends Empleado {
    private Integer aniosExpreriencia;

    public Cocinero(String nombre, Integer numeroLegajo, Date fechaIngreso, Integer aniosExpreriencia) {
        super(nombre, numeroLegajo, fechaIngreso);
        this.aniosExpreriencia = aniosExpreriencia;
    }

    public Integer getAniosExpreriencia() {
        return aniosExpreriencia;
    }

    public void setAniosExpreriencia(Integer aniosExpreriencia) {
        this.aniosExpreriencia = aniosExpreriencia;
    }
}
