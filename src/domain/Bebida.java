package domain;

public class Bebida extends Consumible {
    private Integer tamanioCc;
    private Boolean tieneAlcohol;

    public Bebida(String nombre, Double precio, Integer tamanioCc, Boolean tieneAlcohol) {
        super(nombre, precio);
        this.tamanioCc = tamanioCc;
        this.tieneAlcohol = tieneAlcohol;
    }

    public Integer getTamanioCc() {
        return tamanioCc;
    }

    public void setTamanioCc(Integer tamanioCc) {
        this.tamanioCc = tamanioCc;
    }

    public Boolean getTieneAlcohol() {
        return tieneAlcohol;
    }

    public void setTieneAlcohol(Boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    }

    @Override
    public String toString() {
        return "Bebida [" +
                "nombre: " + getNombre() +
                ", precio: $" + getPrecio() +
                ", tamanioCc: " + tamanioCc +
                ", tieneAlcohol: " + tieneAlcohol +
                ']';
    }
}
