package cartas;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> maoJogador = new ArrayList<>();

		System.out.println("Que começar a jogar? (sim) ou  (não) ");
		String jogar = sc.next();

		int soma = 0;

		while (jogar.equals("sim") && soma <= 20) {
			System.out.println("pedir carta? ");
			String carta = sc.next();
			if (carta.equals("sim")) {

				double sorte = Math.random();
				int n = (int) (1 + sorte * (10 - 1));
				maoJogador.add(n);
				System.out.println(maoJogador);

				for (int numero : maoJogador)
					soma = soma + numero;
				System.out.println("soma das cartas: " + soma);

			} else if (carta.equals("não")) {
				System.out.println("parei");

			}

			if (soma > 21) {

				System.out.println("você perdeu!!");
				maoJogador.clear();
				soma = 0;
				System.out.println("Jogar novamente? ");
				jogar = sc.next();

			} else if (soma == 21) {

				System.out.println("você venceu!!");
				maoJogador.clear();
				soma = 0;

				System.out.println("Jogar novamente? ");
				jogar = sc.next();

			}

		}
		System.out.println(" Obrigado por nos visitar! ");
	}
}
