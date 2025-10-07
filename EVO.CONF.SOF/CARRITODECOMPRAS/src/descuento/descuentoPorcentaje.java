package descuento;


public class descuentoPorcentaje implements DescuentoEstrategia {
    
	private double porcentaje;
    public descuentoPorcentaje(double porcentaje) { this.porcentaje = porcentaje; }

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * porcentaje / 100);
    }
}
