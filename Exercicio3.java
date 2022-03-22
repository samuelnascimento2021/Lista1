package Exercicios_Lista1;
import java.util.Scanner;
public class Exercicio3 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	String frase;
	int cntVogais = 0;
	
	System.out.println("Insira sua frase: ");
	frase = entrada.nextLine();
	
	frase = frase.toUpperCase();
		
	if(frase.indexOf("A")!=-1) cntVogais++;
	if(frase.indexOf("E")!=-1) cntVogais++;
	if(frase.indexOf("I")!=-1) cntVogais++;
	if(frase.indexOf("O")!=-1) cntVogais++;
	if(frase.indexOf("U")!=-1) cntVogais++;
	
			
	System.out.println("Na frase \"" + frase + "\" temos: " + cntVogais + " vogal(is).");

}

}
}
