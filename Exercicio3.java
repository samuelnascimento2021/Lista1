package Exercicios_Lista1;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int cntVogal = 0;
		String frase;
		
		System.out.println("Insira sua frase");
		frase = entrada.nextLine();
		
		frase = frase.toLowerCase();
		
		for(int i=0; i < frase.length(); i++)
			{
				char c = frase.charAt(i);
				if(c == 32) continue;
				if(c == 97 | c == 101 | c==105 | c == 111 | c == 117)
					{
						cntVogal ++;
						continue;
					}
			}
		
		System.out.println("Na frase \"" + frase + "\" temos: " + cntVogal + " vogais.");
	}

}
