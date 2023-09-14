package service;

import domain.EstadoMesa;
import domain.Mesa;

public class MesaService {
    private Integer numero = 0;

    public MesaService() {
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Mesa crear(Integer cantidadComensales) {
        this.numero = getNumero() + 1;
        return new Mesa(this.numero, cantidadComensales, EstadoMesa.DESOCUPADA);
    }

    public void ocupar(Mesa mesa) {
        mesa.setEstadoMesa(EstadoMesa.OCUPADA);
    }

    public void desocupar(Mesa mesa) {
        mesa.setEstadoMesa(EstadoMesa.DESOCUPADA);
    }

    public EstadoMesa estadoMesa(Mesa mesa) {
        return mesa.getEstadoMesa();
    }

    public void mostrarEstado(Mesa mesa) {
        StringBuilder str = new StringBuilder();
        str.append("--------------- Mesa N° " + mesa.getNumero() +  " ---------------");
        str.append("\n");
        str.append("Cantidad de Comensales: ");
        str.append(mesa.getCantidadComensales());
        str.append("\n");
        str.append("Estado: ");
        str.append(mesa.getEstadoMesa());
        str.append("\n");
        str.append("-----------------------------------------");
        str.append("\n");
        System.out.println(str.toString());
    }
}
