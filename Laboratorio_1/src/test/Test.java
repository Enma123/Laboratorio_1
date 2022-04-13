package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Sedan;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	     //CarroBase carro = new CarroBase(); //composition
	     //carro.imprimirCategoria();
		 //System.out.println("*****hello world 2*****");
	       
		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		MotorDiesel motorDiesel = new MotorDiesel();
		
		//inyectando una instancia de motor gasolina al carro sedan
		//esto lo permite el polimorfismo
		CarroBase carro = new Sedan(motorGasolina);//polimorfismo
		carro.imprimirCategoria();
		
		CarroBase crossover = new Crossover(motorGasolina);
		crossover.imprimirCategoria();
		
		CarroBase crossover1 = new Crossover(motorDiesel);
		crossover1.imprimirCategoria();
		
		
		
		
		/*MotorDiesel motorDiesel = new MotorDiesel();
		carro = new Sedan(motorDiesel);//polimorfismo
		carro.imprimirCategoria();
		
		
		carro = new Pickup(motorGasolina);
		carro.imprimirCategoria();
		
		carro = new Pickup(motorDiesel);
		carro.imprimirCategoria();
		
		
		carro = new Suv(motorDiesel);
		carro.imprimirCategoria();
		
		carro = new Suv(motorGasolina);
		carro.imprimirCategoria();
		*/
		
		
		
	}
	
}
