package ejercicios5Records;

import java.util.Scanner;

public class Ejercicio1 {
	Scanner keyboard = new Scanner(System.in);
	public void gestionDeProductos(){
		Producto product1,product2,product3;
		double descuento;
		product1 = new Producto(001,"Libro",25.99);
		product2 = new Producto(002,"Móvil",799.99);
		//product3 = new Producto(-2," ",-12);
		
		System.out.printf("%s",product1.toString());
		
		System.out.printf("Introduce el porcentaje de descuento de %s (%.2f$) :",product2.nombre(),product2.precio());
		descuento = keyboard.nextDouble();
		System.out.printf("%s",product2.aplicarDescuento(descuento));
		
		//product3 da error correctamente al poner precio negativo, una cadena vacia o un id negativo
		
		
	}
	public static void main(String[] args) {
		new Ejercicio1().gestionDeProductos();
	}

}
