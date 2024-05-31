package com.example;

public class Main {

	private static int SIZE;//argumento creado para declarar el numero de personas en el array
	
	public static void main(String[] args) {
		
		
		//condicion para el argumento SIZE
			if(args.length != 0)
				SIZE = Integer.parseInt(args[0]);
		
			
		//para crear un array de persona,
		//llamo a Persona y lo declaro un identificador "arraypersonas";
		//el array es necesario para recorrer los
		//al utlizar el corchete decimos que persona es un array inmutable y no se puede modificar
		
		Persona[] arraypersonas = {
			Persona.builder()
					.nombre("Carlos")
					.primerApellido("Diaz")
					.salario(2500.50)
					.genero(Genero.HOMBRE)
					.build(),
			Persona.builder()
					.nombre("Maria Jose")
					.primerApellido("Rodriguez")
					.salario(2500.50)
					.genero(Genero.MUJER)
					.build(),
			Persona.builder()
					.nombre("Tamara")
					.primerApellido("Sanchez")
					.salario(2500.50)
					.genero(Genero.MUJER)
					.build(),
			Persona.builder()
					.nombre("Adrian")
					.primerApellido("Santos")
					.salario(3000.50)
					.genero(Genero.HOMBRE)
					.build()};
			//esto es un array de la clase persona
					
			/*¿que podemos hacer con los array de objetos?*/
				//1. recorrerlos y mostrar los elementos por consola
				//¿como recorremos el array de persona?
					//con un for mejorado:
				
		System.out.println("Recorriendo el array de personas ----------");
		for(Persona persona : arraypersonas)
			System.out.println(persona);
		
		
			/*Recorrer el array de personas y almacenar las personas del genero MUJER
			 * en un nuevo array que podemos llamar arrayDeMujeres*/
		
		Persona[] arrayDeMujeres = new Persona[SIZE];//Agregamos argumento #10 en el proyecto
		
		int indice = 0;
		
		for(Persona p : arraypersonas) {
			if(p.getGenero().equals(Genero.MUJER))
				arrayDeMujeres[indice++] = p;
		}
		
		System.out.println("Personas del genero mujer...........");
		for(Persona mujer : arrayDeMujeres ) {
			if (mujer != null)
				System.out.println(mujer);
			else
				break;//sentencia para romper el bucle , metodo para no seguir ejecutando la accion
		}
			
		
	}

}
