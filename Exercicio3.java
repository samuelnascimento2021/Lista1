package Exercicios_Lista1;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int cntVogais = 0;
		String frase, vogais="";
		
		System.out.println("Insira sua frase");
		frase = entrada.nextLine();
		
		frase = frase.toLowerCase();
		
		for(int i=0; i < frase.length(); i++)
			{
				char c = frase.charAt(i);
				if(c == 'a' | c == 'e' | c=='i' | c == 'o' | c == 'u')
				{
					vogais = vogais + Character.toString(c);
				}
			}
		
		if (vogais.contains("a"))
          		cntVogais++;
      		if (vogais.contains("e"))
          		cntVogais++;
      		if (vogais.contains("i"))
        		cntVogais++;
     		if (vogais.contains("o"))
       		  	cntVogais++;
      		if (vogais.contains("u"))
         	   	cntVogais++;
    
    
    		System.out.println("Na frase \"" + frase + "\" temos: " + cntVogais + " vogal(is).");
	}

}
