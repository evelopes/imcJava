package Calculo;

public class TestaIMC {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.peso = 80;
		p1.altura = 1.50;
		
		System.out.println(p1.calculoImc());
	}
	

}
