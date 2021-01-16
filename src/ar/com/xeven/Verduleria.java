package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Verduleria {

    public static void main(String[] args) {
	    List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("fruta","manzana",10));
        productos.add(new Producto("verdura","lechuga",8));
        productos.add(new Producto("fruta","pera",15));
        productos.add(new Producto("fruta","uva",20));
        productos.add(new Producto("verdura","zapallo",14));

        // Para cada producto dentro del array:
        productos.forEach((producto)->{
            System.out.println(producto);
        });
        //3. duplicar la cantidad de la fruta 2 y la verdura 1
        Producto p = obtenerProducto("fruta",2,productos);
        p.setCantidad(p.getCantidad()*2);

        Producto verdura = obtenerProducto("verdura",1,productos);
        verdura.setCantidad(verdura.getCantidad()*2);

        //4. eliminar la fruta 1
        Producto fruta1 = obtenerProducto("fruta",1,productos);
        productos.remove(fruta1);

        productos.forEach((producto)->{
            System.out.println(producto);
        });

    }

    public static Producto obtenerProducto(String tipo, Integer posicion, List<Producto> productos) {
        int contadorProductos = 0;
        for (int cont = 0; cont < productos.size(); cont++) {
            Producto p = productos.get(cont);
            if (p.getTipo() == tipo) {
                contadorProductos++;
                if (contadorProductos == posicion) {
                    return p;
                }
            }
        }
        return null;
    }
}
