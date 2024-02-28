package primeiro_projeto;

import java.util.Scanner;

public class nome_idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variaveis
		String nome,idade,conj;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		//Entrada de dados 
		System.out.println("informe o seu nome");
		nome = ler.next();
		System.out.println("informe a sua idade");
		idade = ler.next();
		//Processamento
		//Saida 
		System.out.println("Seu nome e sua idade:" + nome + ", " + idade + " anos ");
		// TODO Auto-generated method stub

	}

}
