package Calculo;

public class Pessoa {
	double altura, peso;
	
	double calculoImc() {
		return this.peso / (this.altura * this.altura);
	}
	
	
}
