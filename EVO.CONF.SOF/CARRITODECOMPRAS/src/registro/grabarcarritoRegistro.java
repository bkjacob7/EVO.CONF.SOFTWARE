package registro;



public class grabarcarritoRegistro implements carritoRegistro{

    @Override
    public void grabarCarrito(int cantidadProductos) {
        System.out.println("Se grabo en el carrito de compras: " + cantidadProductos + "producto(s)");
    }
}

