package Principal.entidades;

public class Fruta extends Producto{
    
    private String unidadVenta;

    public Fruta() {
    }
    
    public Fruta(String unidadVenta, String nombre, Double litro, Integer precio) {
        super(nombre, litro, precio);
        this.unidadVenta = unidadVenta;
    }

    
    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: $%s /// Unidad de venta: %s", this.nombre,this.precio,this.unidadVenta);
    }
    
}
