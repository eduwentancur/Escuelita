
package Principal.entidades;

public class Shampoo extends Producto{

    private String contenido;

    public Shampoo() {
    }
    
    public Shampoo(String contenido, String nombre, Double litro, Integer precio) {
        super(nombre, litro, precio);
        this.contenido = contenido;
    }
    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
         return String.format("Nombre: %s /// Contenido: %s /// Precio: $%s", this.nombre,this.contenido,this.precio);
    }
    
}
