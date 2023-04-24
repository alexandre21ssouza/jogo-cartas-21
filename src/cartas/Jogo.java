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
		}
	}
}
