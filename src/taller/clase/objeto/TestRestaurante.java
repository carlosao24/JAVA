package taller.clase.objeto;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest;
		
		rest = new Restaurante();
		
		rest.nombre = "KFC";
		rest.direccion = "Av. de la Prensa";
		rest.calificacion = 4.1;
		
		System.out.println("==============Restaurante 1=========");
		System.out.println("Restaurante: " + rest.nombre);
		System.out.println("Dirección: " + rest.direccion);
		System.out.println("Calificación: " + rest.calificacion);
		
		rest.nombre = "Domino's";
		rest.direccion = "Av. francisco de Orellana";
		rest.calificacion = 4.4;
		
		System.out.println("==============Restaurante 2=========");
		System.out.println("Restaurante: " + rest.nombre);
		System.out.println("Dirección: " + rest.direccion);
		System.out.println("Calificación: " + rest.calificacion);
		
		

	}

}
