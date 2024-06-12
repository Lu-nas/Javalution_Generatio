package exerVetores;

import java.util.Scanner;

public class vetoresImPares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // Vetor já inicializado
        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int soma = 0;
        // percorre o laco e le os 10 numeros int e armazena em um valor
        for (int i = 0; i < vetor.length; i++) {
             // Não precisamos mais pedir para o usuário digitar, pois o vetor já está inicializado
             System.out.println("\n digite um numero " + (i + 1));
             vetor[i] = ler.nextInt();
            // pedindo pra acumular a soma dos elementos
            soma += vetor[i];
        }
        
        // mostrar os elementos pares do vetor 
        System.out.println("Elementos pares no vetor: ");
        // Utilizaremos uma variável diferente de i para evitar problemas
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                System.out.println(vetor[j]);
            }
        }
    }
}
