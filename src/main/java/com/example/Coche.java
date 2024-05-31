package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coche {

	private String marca;
	private String modelo;
	
	//private static String paisDelFabricante  = "Alemania"; //vive en el plano del objeto
	public static final String paisDelFabricante  = "Alemania";
}
