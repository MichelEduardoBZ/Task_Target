package Sequencia_Fibonacci;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int numeroInicial = 1;

		int numeroAnterior = 0;

		for (int i = 0; i < 30; i++) {

			System.out.println(numeroInicial);

			int auxiliar = numeroInicial;

			numeroInicial += numeroAnterior;

			numeroAnterior = auxiliar;

			i++;

		}
	}

}
