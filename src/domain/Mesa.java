package domain;

public class Mesa {
    private Integer numero;
    private Integer cantidadComensales;
    private EstadoMesa estadoMesa;

    public Mesa(Integer numero, Integer cantidadComensales, EstadoMesa estadoMesa) {
        this.numero = numero;
        this.cantidadComensales = cantidadComensales;
        this.estadoMesa = estadoMesa;
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

    public EstadoMesa getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstado(EstadoMesa estadoMesa) {
        this.estadoMesa = estadoMesa;
    }
}
