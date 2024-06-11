package lacosCondicionais;

import java.util.Scanner;

public class idade {
// exercicio 3 idade menor "< 21" maior "> 50"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idadeMaior = 0, idadeMenor = 0, idade;
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		while (idade > 0) { 
			if(idade < 21) {
				idadeMenor ++;
			}else if(idade > 50){
				idadeMaior ++;
			}
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
		}	
		System.out.println("Total de pessoas menores de 21 anos: "+ idadeMenor);
		System.out.println("Total de pessoa maiores de 50 anos : "+ idadeMaior);
	}
		
}
