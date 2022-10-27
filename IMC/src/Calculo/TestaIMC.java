package Calculo;

import java.util.Scanner;

public class TestaIMC {
	public static void main(String[] args) {
		int resposta = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			Pessoa p1 = new Pessoa();
			System.out.println("Digite o peso:");
			p1.peso = entrada.nextDouble();
			System.out.println("Digite agora a altura:");
			p1.altura = entrada.nextDouble();
			System.out.println(p1.calculoImc());
			System.out.println("Digite 1 para fazer um novo calculo, ou 0 para encerrar!");
			resposta = entrada.nextInt();
			
		}while(resposta != 0);
		
	}
	

}
