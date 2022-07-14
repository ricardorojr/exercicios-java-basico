package exercicio_loops;

import java.util.Scanner;

public class Exercicio_2 {

	/*
	 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a
	 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
	 * pedir as informações.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		String senha;
		Boolean validade = false;

		do {

			System.out.println("Informe um nome de usuário e senha");

			nome = scanner.next();
			senha = scanner.next();

			if (nome.equals(senha)) {
				System.out.println("Usuários e senha não são válidos. Tente Novamente");
			} else {
				validade = true;
				System.out.println("Usuários e senha válidos!");
			}

		} while (!validade);

	}

}
