package Principal;

import Principal.entidades.Fruta;
import Principal.entidades.Gaseosa;
import Principal.entidades.Producto;
import Principal.entidades.Shampoo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Shampoo shampoo = new Shampoo();
        Fruta fruta = new Fruta();

        shampoo.setContenido("500ml");
        shampoo.setNombre("Shampoo Sedal");
        shampoo.setPrecio(19);

        fruta.setNombre("Frutilla");
        fruta.setPrecio(64);
        fruta.setUnidadVenta("kilo");

        listaProductos.add(new Gaseosa("Coca-Cola Zero", 1.5, 20));
        listaProductos.add(new Gaseosa("Coca-Cola", 1.5, 18));
        listaProductos.add(shampoo);
        listaProductos.add(fruta);
        printList(listaProductos);
        System.out.println("=============================");
        Collections.sort(listaProductos);
        System.out.println("Producto mas caro: " + Collections.min(listaProductos).getNombre());
        System.out.println("Producto mas barato: " + Collections.max(listaProductos).getNombre());
    }
    
    public static void printList(List<Producto> listaProductos){
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

}
