package primeiro_projeto;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Variaveis
		double horatrab, valorhora, salbruto, saliqui, inss;
		
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de Dados
		System.out.println("Quantas horas você trabalhou?");
		horatrab = ler.nextDouble ();
		System.out.println("Qual o valor da sua hora");
		valorhora = ler.nextDouble ();
		
		//Processamento
		salbruto = horatrab = valorhora ;
		inss = salbruto * 0.12 ;
		saliqui = salbruto - inss ;
		
		//Saida de dados
		System.out.println("o valor do seu salário bruto é:" + salbruto + ",");
		System.out.println("E o seu salário liquido é:"+ saliqui + ".");
		
		

	}

}
