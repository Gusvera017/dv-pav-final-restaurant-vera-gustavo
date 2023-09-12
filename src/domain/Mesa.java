package domain;

public class Mesa {
    private Integer numero;
    private Integer cantidadComensales;
    private EstadoMesa estado;

    public Mesa(Integer numero, Integer cantidadComensales, EstadoMesa estado) {
        this.numero = numero;
        this.cantidadComensales = cantidadComensales;
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCantidadComensales() {
        return cantidadComensales;
    }

    public void setCantidadComensales(Integer cantidadComensales) {
        this.cantidadComensales = cantidadComensales;
    }

    public EstadoMesa getEstado() {
        return estado;
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }
}
