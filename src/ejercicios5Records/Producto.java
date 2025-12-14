package ejercicios5Records;

public record Producto(int id,String nombre, double precio) {
	
	public Producto{
		if (id<0) {
			throw new IllegalArgumentException("El Id debe ser positivo!!!");
		}
		
		if (nombre.equals(null)||nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("Debes rellenar el nombre");
		}
		if (precio<0) {
			throw new IllegalArgumentException("El precio debe ser mayor a 0");
		}
	}
	public Producto aplicarDescuento(double descuento) {
		double precioRebajado;
		if (descuento<0||descuento>100) {
			throw new IllegalArgumentException("Introduce un descuento valido");
		}
		precioRebajado = this.precio*(1-(descuento/100));
		return new Producto(this.id,this.nombre,precioRebajado);
		
	}
	public String toString() {
		return String.format("Datos del producto :\nId : %d\nNombre : %s\nPrecio : %.2f$\n",id,nombre,precio);
	}

}
