package exercicio_loops;

public class Exercicio_4 {
	/*
	 * 4. Supondo que a população de um país A seja da ordem de 80.000 habitantes
	 * com uma taxa anual de crescimento de 3% e que a população de B seja 200.000
	 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
	 * e escreva o número de anos necessários para que a população do país A
	 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
	 */
	public static void main(String[] args) {

		int a = 80000;
		int b = 200000;
		int anos = 0;

		while (a < b) {

			a += (a / 100) * 3;
			b += (b / 100) * 1.5;

			anos++;
		}

		System.out.println("População A: " + a);
		System.out.println("População B: " + b);
		System.out.println("Quantidade de anos: " + anos);
	}

}
