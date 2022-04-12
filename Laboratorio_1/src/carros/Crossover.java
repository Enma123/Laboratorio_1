package carros;

import motores.Motor;

public class Crossover extends CarroBase{

	public Crossover(Motor motor) {
		super(motor);
	}
	
	public void imprimirCategoria(){
		System.out.println("Soy Crossover");
		imprimirMotor();
	}
	
	public void imprimirCategoria(String name) {
		System.out.println(name);
	}
}
