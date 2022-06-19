package com.sergio.oop;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		Carro fusca = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		fusca.marca = "Volkswargen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 50;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println("Marca: "+ van.marca);
		System.out.println("Modelo: "+ van.modelo);
		
		System.out.println("Marca: "+fusca.marca);
		System.out.println("Modelo: "+ fusca.modelo);
		
	}

}
