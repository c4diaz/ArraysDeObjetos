package com.example;

public class Main {

	private static int SIZE;//argumento creado para declarar el numero de personas en el array
	
	public static void main(String[] args) {
		
		
		//condicion para el argumento SIZE
		if(args.length != 0)
			SIZE = Integer.parseInt(args[0]);
		
		
		
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
			
			
			
			/*Calcular el salario promedio por genero*/
			
			//para hacer este calculo toca declarar una variable por cada genero.
			
			double sumatoriaSalariosHombre = 0.0;
			double sumatoriaSalariosMujer = 0.0;
			double sumatoriaSalariosOtro = 0.0;
			
			int totalGeneroHombre = 0;
			int totalGeneroMujer = 0;
			int totalGeneroOtro = 0;
			
			double salarioPromedioHombres = 0.0;
			double salarioPromedioMujeres = 0.0;
			double salarioPromedioOtros = 0.0;
			
			for(Persona p : arraypersonas) {
				if(p.getGenero().equals(Genero.HOMBRE)) {
					sumatoriaSalariosHombre += p.getSalario();
					totalGeneroHombre++;
				}else if(p.getGenero().equals(Genero.MUJER)) {
					sumatoriaSalariosMujer += p.getSalario();
					totalGeneroMujer++;
				}else {
					sumatoriaSalariosOtro += p.getSalario();
					totalGeneroOtro++;
					}
				}
			
			salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
			salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
			salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;
			
			System.out.println("Salario promedio de los Hombres: " + salarioPromedioHombres);
	      	System.out.println("Salario promedio de las Mujeres: " + salarioPromedioMujeres);
	      	System.out.println("Salario promedio de Otros Generos: " + salarioPromedioOtros);
		
			
	}
	
}
