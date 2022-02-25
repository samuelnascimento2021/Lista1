package Exercicios_Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String placa;
		int ano;
		
		System.out.println("Insira a placa do carro");
		placa = entrada.nextLine();
		System.out.println("Insira o ano de fabricação do veículo");
		ano = entrada.nextInt();
		
			if(ano < 2010)
				{
					System.out.println("Carro velho");
				}
			else if(ano >= 2011 & ano <= 2021)
				{
					System.out.println("Carro seminovo");
				}
			else if(ano == 2022)
				{
					System.out.println("Carro novo");
				}
			else 
				{
					System.out.println("O ano do veículo não pode exceder o ano de 2022");
				}
		
		String newPlaca = placa
				.replace("A", "*")
				.replace("a", "*")
				.replace("E", "*")
				.replace("e", "*")
				.replace("I", "*")
				.replace("i", "*")
				.replace("O", "*")
				.replace("o", "*")
				.replace("U", "*")
				.replace("u", "*");
		
		System.out.println("Sua placa é: " + newPlaca);
			
			
	}

}
