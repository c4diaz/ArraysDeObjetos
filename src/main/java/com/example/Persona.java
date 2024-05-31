package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private double salario;
	private Genero genero; //Propiedad enumerable, se creò el tipo de dato enum Genero

	
}
