
package principal;  // Clase pertenece al paquete principal

 
public class Gestion {  // Declaración de la clase.

	// Atributos de clase
	
	private Producto productos[] = null;
	private double caja;

	
	// Constructores de clase
	
	public Gestion() {
	}
	public Gestion(Producto[] productos) {
		this.productos = productos;
	}
	

	// Métodos de clase.
	
	public Producto[] getProductos() {

		return productos;
	}

	public void mostrarProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.print(productos[i] + "\n-------\n");
		}
	}

	public void mostrarNombreProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(i + 1 + " " + productos[i].getNombre() + "\n");
		}
		System.out.println("\n------------\n");
	}

	public double comprarProducto(Producto[] productos, int num, int cantidadUnidades) {
		if (productos[num - 1].isDisponible()) {
			if (productos[num - 1].getCantStock() >= cantidadUnidades) {
				System.out.println("La compra se ha realizado con éxito!!\n");
				productos[num - 1].setCantStock(productos[num - 1]
						.getCantStock() - cantidadUnidades);
				return caja += cantidadUnidades
						* productos[num - 1].getPrecioUnit();
			} else {
				System.out.println("No hay cantidad suficiente de producto");
			}
		} else {
			System.out.println("No hay cantidad suficiente de producto");
		}
		return caja;
	}

	public double mostrarCaja() {
		System.out.print("El total de la caja es ");
		caja = Math.round(caja * 100);
		return caja / 100;
	}
}



