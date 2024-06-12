package operadores;

import java.util.Scanner;

public class notasMedia {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, mediafinal = 0;
		
		System.out.println("Digite as Quatro notas");
		n1= leia.nextFloat();
		n2= leia.nextFloat();
		n3= leia.nextFloat();
		n4= leia.nextFloat();
		
		mediafinal = (n1 + n2 + n3 + n4)/4;
		System.out.println("mediafinal:  " + mediafinal );
	}

}
