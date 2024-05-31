package com.example;

public class Main {


	
	public static void main(String[] args) {
		
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
			
			System.out.println("El salario promedio de las personas es ----------");
			
			
			double sumatoriaDeLosSalarios = 0.0;
			int totalDePersonas = arraypersonas.length;
			double salarioPromedio = 0.0;
			
			for(Persona persona : arraypersonas) {
				//sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario();
				  sumatoriaDeLosSalarios += persona.getSalario();
			}
			salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
			
			System.out.println("El salario promedio de todas las personas es : " + salarioPromedio);
		
	}
	
}
