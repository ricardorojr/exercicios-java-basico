package exercicio_loops;

import java.util.Scanner;

//10.Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo número");
		int num2 = scan.nextInt();

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}
}
