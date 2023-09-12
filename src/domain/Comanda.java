package domain;

import java.util.List;
import java.util.Objects;

public class Comanda {
    private Menu menu;
    private List<Consumible> consumidos;
    private Mesa mesa;
    private Mozo mozo;
    private Cocinero cocinero;
    private FormaPago formaPago;

    public Comanda(Menu menu, List<Consumible> consumidos, Mesa mesa, Mozo mozo, Cocinero cocinero, FormaPago formaPago) {
        this.menu = menu;
        this.consumidos = consumidos;
        this.mesa = mesa;
        this.mozo = mozo;
        this.cocinero = cocinero;
        this.formaPago = formaPago;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Consumible> getConsumidos() {
        return consumidos;
    }

    public void setConsumidos(List<Consumible> consumidos) {
        this.consumidos = consumidos;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mozo getMozo() {
        return mozo;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }

    public Cocinero getCocinero() {
        return cocinero;
    }

    public void setCocinero(Cocinero cocinero) {
        this.cocinero = cocinero;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comanda comanda = (Comanda) o;
        return menu.equals(comanda.menu) && consumidos.equals(comanda.consumidos) && mesa.equals(comanda.mesa) && mozo.equals(comanda.mozo) && cocinero.equals(comanda.cocinero) && formaPago == comanda.formaPago;
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu, consumidos, mesa, mozo, cocinero, formaPago);
    }

    @Override
    public String toString() {
        return "Comanda [" +
                "menu: " + menu +
                ", consumidos: " + consumidos +
                ", mesa: " + mesa +
                ", mozo: " + mozo +
                ", cocinero: " + cocinero +
                ", formaPago: " + formaPago +
                ']';
    }
}
