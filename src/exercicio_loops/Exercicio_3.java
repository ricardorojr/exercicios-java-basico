package exercicio_loops;

import java.util.Scanner;

public class Exercicio_3 {
	/*
	 * 3. Faça um programa que leia e valide as seguintes informações: a. Nome:
	 * maior que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero;
	 * d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome, sexo, estCivil;
		int idade;
		Double salario;
		Boolean valida = false;

		do {
			System.out.println("Informe o nome!");
			nome = scanner.next();

			if (nome.length() <= 3) {
				System.out.println("Informe o nome com no minimo 3 letras!");
			} else {
				valida = true;
				System.out.println("Correto");
			}

		} while (!valida);

		valida = false;

		do {
			System.out.println("Qual a sua idade?");
			idade = scanner.nextInt();

			if (idade >= 0 && idade <= 150) {
				valida = true;
			} else {

				System.out.println("Informe a idade entre 0 e 150 anos");
			}

		} while (!valida);

		valida = false;

		do {
			System.out.println("Informe o sexo");
			sexo = scanner.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				valida = true;
			} else {

				System.out.println("Sexo pode ser 'f' ou 'm'.");
			}

		} while (!valida);

		valida = false;

		do {
			System.out.println("Informe seu salário!");
			salario = scanner.nextDouble();

			if (salario > 0) {
				valida = true;
			} else {

				System.out.println("Informe um salário maior que 0!");
			}

		} while (!valida);

		valida = false;

		do {
			System.out.println("Informe seu estado civil");
			estCivil = scanner.next();

			if (estCivil.equalsIgnoreCase("s") || estCivil.equalsIgnoreCase("d") || estCivil.equalsIgnoreCase("c")
					|| estCivil.equalsIgnoreCase("v")) {
				valida = true;
			} else {

				System.out.println("o estado civil precisa ser 's', 'd', 'c', 'v'.");
			}

		} while (!valida);

		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("salario: " + salario);
		System.out.println("estCivil: " + estCivil);
		System.out.println("sexo: " + sexo);

	}
}
