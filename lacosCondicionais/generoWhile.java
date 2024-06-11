package lacosCondicionais;

import java.util.Scanner;

public class generoWhile {

	public static void main(String[] args) {
		int devsBackend = 0;
		int mulheresCTFrontend = 0;
		int homensCTMobile40 = 0;
		int nBiFullstack30 = 0;
		int totalRespostas = 0;
		float mediaIdade;
		boolean continuar = true;
		Scanner ler = new Scanner(System.in);
		while (continuar) {
//			
			System.out.printf("Idade: ");
			int idade = ler.nextInt();
			idade = 1 ;
	
			String listaGenero = "1- Mulher Cis\n" + "2- Homen Cis\n" + "3- Não Binário\n" + "4- Mulher Trans\n"
					+ "5- Homen Trans\n" + "6- Outros", resposta = "n";
			System.out.printf("\nEscolha o Genero:\n" + listaGenero + "\nNúmero do Genero: ");
	
			int genero = ler.nextInt();
	
			String listaDesenvolvedor = "1- Backend\n" + "2- FrontEnd\n" + "3- Mobile\n" + "4- Fullstack\n";
			System.out.printf("\nDesenvolvedor: \n" + listaDesenvolvedor + "Numero Dev: ");
			int desenvolvedor = ler.nextInt();
	
			if (desenvolvedor == 1) {
				devsBackend = devsBackend + 1;
			}
			if (desenvolvedor == 2 && (genero == 1 || genero == 4)) {
				mulheresCTFrontend =  mulheresCTFrontend + 1;
			}
			if (genero == 2 || genero == 5 && desenvolvedor == 3 && idade > 40) {
				homensCTMobile40 = homensCTMobile40 +1 ;
			}
			if (genero == 3 && desenvolvedor == 4 && idade < 30) {
				nBiFullstack30 = nBiFullstack30 + 1;
			}
			totalRespostas = totalRespostas + 1;
			
			System.out.print("Deseja continuar sua pesquisa?(S/N): ");
			String pesquisar = ler.next();
			if(pesquisar.equalsIgnoreCase( "N")) {
				continuar = false;
				
				 //Resultado final
				
					System.out.print("\nTotal de pessoas desenvolvedoras Backend: " + devsBackend);
					System.out.print("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCTFrontend);
					System.out.print("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
							+ homensCTMobile40);
					System.out.print("\nTotal de pessoas Não Binarias desenvolvedoras FullStack menores de 30anos: "
							+ nBiFullstack30);	
			}
		}
	}
}