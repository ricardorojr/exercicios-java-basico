package exercicio_loops;

import java.util.Scanner;

//11.Altere o programa anterior para mostrar no final a soma dos números.

public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo número");
		int num2 = scan.nextInt();

		int soma = 0;

		for (int i = num1; i <= num2; i++) {
			soma += i;
		}

		System.out.println("Soma: " + soma);

	}

}
