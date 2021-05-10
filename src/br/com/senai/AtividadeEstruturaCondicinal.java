package br.com.senai;

import java.util.Scanner;

public class AtividadeEstruturaCondicinal {

	public static void main(String[] args) {
	
	Scanner tec = new Scanner(System.in);
	System.out.println("Informe o valor: ");
	int valor = tec.nextInt();
	
		int multiplicador = 0;
				
			while (multiplicador <= 10) {
			System.out.println(valor +" x "+ multiplicador +" = " + valor*multiplicador);
			multiplicador += 1;
			
		}
	 
	}

}

//
//
//
//
