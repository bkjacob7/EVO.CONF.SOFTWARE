package servicio;

import codigoMejorado.*;
import descuento.*;
import registro.*;
import java.util.*;

public class carritoMain {
    private List<Producto> productos;
    private DescuentoEstrategia descuentoEstrategia;
    private carritoRegistro registro;
  
    
 public carritoMain(DescuentoEstrategia descuentoEstrategia,  carritoRegistro registro) {
       this.productos = new ArrayList<>();
       this.descuentoEstrategia = descuentoEstrategia;
       this.registro = registro;
    }
    public void agregarProducto(Producto producto) {
    	productos.add(producto);
    }
    public void setDescuentoEstrategia(DescuentoEstrategia descuentoEstrategia) {
        this.descuentoEstrategia = descuentoEstrategia;
    }
    public double calcularTotal() {
        double sum = 0.0;
        for (Producto  p : productos) { sum += p.getPrecio();}
        return descuentoEstrategia.aplicarDescuento(sum);
    }
    public void pagar() {
        double total = calcularTotal();
        System.out.println("Compra completada. Total: " + total);
       registro.grabarCarrito(productos.size());
    }
}

