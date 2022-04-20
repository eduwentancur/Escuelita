
package Principal.entidades;

public class Producto implements Comparable<Producto> {
    protected String nombre;
    protected Double litro;
    protected Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Double litro, Integer precio) {
        this.nombre = nombre;
        this.litro = litro;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getLitro() {
        return litro;
    }

    public void setLitro(Double litro) {
        this.litro = litro;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


    @Override
    public int compareTo(Producto o) {
        if (this.precio > o.precio){
            return -1;
        }else if (this.precio < o.precio){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %s /// Precio: $%s", this.nombre,this.litro,this.precio);
    }
    
}
