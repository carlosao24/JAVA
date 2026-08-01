package taller.clase.objeto;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		Plato platoB = new Plato();
		Plato platoC = new Plato();
		
		platoA.nombre = "10 Presas";
		platoA.tipo = "Presas solas";
		platoA.precio = 17.99f;
		platoA.disponible = true;
		
		System.out.println("===================Plato 1==============");
		System.out.println("Opción 1: "+platoA.nombre);
		System.out.println("Tipo: "+platoA.tipo);
		System.out.println("Precio: "+platoA.precio);
		System.out.println("Disponible: "+platoA.disponible);
		
		platoB.nombre = "Big Box Aros";
		platoB.tipo = "Aros de Cebolla";
		platoB.precio = 7.99f;
		platoB.disponible = true;
		
		System.out.println("===================Plato 2==============");
		System.out.println("Opción 2: "+platoB.nombre);
		System.out.println("Tipo: "+platoB.tipo);
		System.out.println("Precio: "+platoB.precio);
		System.out.println("Disponible: "+platoB.disponible);
		
		platoC.nombre = "Big Box Gamer";
		platoC.tipo = "Boxes";
		platoC.precio = 6.99f;
		platoC.disponible = false;
		
		System.out.println("===================Plato 3==============");
		System.out.println("Opcion 3: "+platoC.nombre);
		System.out.println("Tipo : "+platoC.tipo);
		System.out.println("Precio: "+platoC.precio);
		System.out.println("Disponible: "+platoC.disponible);
		

	}

}
