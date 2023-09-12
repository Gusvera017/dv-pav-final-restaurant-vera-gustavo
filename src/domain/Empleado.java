package domain;

import java.util.Date;

public class Empleado {
    private String nombre;
    private Integer numeroLegajo;
    private Date fechaIngreso;

    public Empleado(String nombre, Integer numeroLegajo, Date fechaIngreso) {
        this.nombre = nombre;
        this.numeroLegajo = numeroLegajo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
