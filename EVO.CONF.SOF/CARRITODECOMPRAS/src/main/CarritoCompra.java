package main;

import codigoMejorado.*;
import descuento.*;
import registro.*;
import servicio.*;

public class CarritoCompra {

	    public static void main(String[] args) {
	        DescuentoEstrategia descuento = new descuentoPorcentaje(10);
                         carritoRegistro registro = new grabarcarritoRegistro();

                        carritoMain carrito = new carritoMain(descuento, registro);
                        
	        carrito.agregarProducto (new Producto("Laptop", 1000));
	        carrito.agregarProducto(new Producto("Mouse", 50));

	        carrito.pagar();
	    }
}
