package domain;

import java.util.Date;

public class Chef extends Cocinero {
    private String titulo;

    public Chef(String nombre, Integer numeroLegajo, Date fechaIngreso, Integer aniosExpreriencia, String titulo) {
        super(nombre, numeroLegajo, fechaIngreso, aniosExpreriencia);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
