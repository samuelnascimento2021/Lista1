package Exercicios_Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tempo, vm;
		double consumo, valor;
		
		System.out.println("Informe o tempo, em horas, gasto na viagem");
		tempo=entrada.nextInt();
		System.out.println("Informe a velocidade média");
		vm= entrada.nextInt();
		System.out.println("Informe o valor do km/l do veículo");
		valor= entrada.nextDouble();
		
		consumo = ((tempo * vm) / valor);
		
		System.out.println("O consumo final de combustivel em litros é: " + consumo);

	}

}
