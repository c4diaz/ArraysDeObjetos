package com.example;

public class Main {

	public static void main(String[] args) {

		// crearemos un array que contenga tanto personas como coches en el mismo

		Object[] personasYCoches = {
				Persona.builder().nombre("Rosa").primerApellido("Castro").genero(Genero.MUJER).build(),
				Persona.builder().nombre("Marly").genero(Genero.MUJER),
				Coche.builder().marca("Audi").modelo("AMG").build(), Coche.builder().marca("Audi").modelo("AMG").build()

		};

		// Recorrer el array con for mejorado y operar con los elementos segun el tipo
		// objeto es el nombre del array
		for (Object objeto : personasYCoches) {
			// tengo que determinar si el objeto es una instancia de persona o de coche
			// para lo cual se utiliza el operadot INSTANCEOF, que comprueba si un objeto
			// es una instancia de algun tipo

			if (objeto instanceof Persona p) {
			//	Persona p = (Persona) objeto;  // Con PATTER MATCHING
				System.out.println("Nombre de la persona: " + p.getNombre());
			} else if (objeto instanceof Coche c) {
			//	Coche c = (Coche) objeto;
				System.out.println("La marca del coche es: " + c.getMarca());
				System.out.println("El pais del fabricante es: " + Coche.paisDelFabricante);
			}
		}
	}
}


