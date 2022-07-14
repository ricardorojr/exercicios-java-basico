package exercicio_loops;

import java.util.Scanner;

/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido 
e continue pedindo até que o usuário informe um valor válido. */

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double nota;

		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scanner.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Valor Incorreto!");

			}
		} while (nota < 0 || nota > 10);
		System.out.printf("Está correto, o valor foi: %.1f", nota);
	}

}
