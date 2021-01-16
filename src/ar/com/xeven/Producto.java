package ar.com.xeven;

public class Producto {
    private String tipo;
    private String nombre;
    private Integer cantidad;

    public Producto(String tipo, String nombre, Integer cantidad) {
        this.setTipo(tipo);
        this.setNombre(nombre);
        this.setCantidad(cantidad);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
