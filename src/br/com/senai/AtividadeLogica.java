package br.com.senai;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		int opcao;
				
		do {
			System.out.println("--- MENU ---");
			System.out.println("-- 1- Verificar sexo e idade--");
			System.out.println("-- 2- Contagem de valores --");
			System.out.println("-- 3- Tabuada --");
			System.out.println("-- 4- Cadastrar cursos --");
			System.out.println("-- 5- Sair --");
			System.out.println("                          ");
			System.out.println("Informe a opção desejada: ");
			opcao = tec.nextInt();
			
			switch(opcao) { 
			
			case 1:
				System.out.println("-- 1- Verificar sexo e idade--");
				String nome;
				System.out.println("Informe o nome: ");
				nome = tec.next();
				int anoDeNascimento;
				System.out.println("Informe o ano de nascimento: ");
				anoDeNascimento = tec.nextInt();
				int idade = 2021 - anoDeNascimento;
				String sexo;
				System.out.println("Informe seu sexo: [f/m]");
				sexo = tec.next();
				System.out.println(nome + ", você nasceu em " +anoDeNascimento +" e tem "+ idade + " anos de idade.");
				
					if (idade > 12) {
						System.out.println("Você é criança.");
					}
					else if(idade > 12 || idade < 18){
						 System.out.println("Você é jovem.");
						}
					else if(idade > 18 || idade < 65) {
						System.out.println("Você é adulto.");
					}
					else {
						System.out.println("Você é idoso.");
					}
					
					if(idade < 16) {
						System.out.println("Você não pode votar.");
					}
					else if(idade < 18 || idade < 70) {
						System.out.println("Seu voto é obrigatório.");
					}
					else {
						System.out.println("Seu voto é opcional.");
					}
					
					if(idade > 18) {
						System.out.println("Você tem permição para tirar a carteira de habilitação");
					}
					else {
						System.out.println("Você não tem permição para tirar a carteira de habilitação");	
					}
					
					if(sexo.equalsIgnoreCase("M")) {
						System.out.println("Você é do sexo masculino.");
					}
					else if(sexo.equalsIgnoreCase("F")) {
						System.out.println("Você é do sexo feminino.");
					}
					else {
						System.out.println("Erro na validação do sexo.");
					}
					
				break;	
				
			case 2:
				System.out.println("-- 2- Contagem de valores--");
				
				int primeiroValor;
				System.out.print("Informe o primeiro valor: ");
				primeiroValor = tec.nextInt();
				int segundoValor;
				System.out.print("Informe o segundo valor: ");
				segundoValor = tec.nextInt();
				if (primeiroValor < segundoValor) {
					while (primeiroValor <= segundoValor) {
					System.out.println(primeiroValor);
					primeiroValor += 1;
					}
				}
				else if (primeiroValor > segundoValor) {
					while (primeiroValor >= segundoValor) {
					System.out.println(primeiroValor);
					primeiroValor = primeiroValor - 1;
					}
				}
					
				break;
				
			case 3:
				System.out.println("-- 3- Tabuada --");
				
				int valor;
				int multiplicador = 0;
				
				System.out.println("Informe um valor inteiro: ");
				valor = tec.nextInt(); 
				
				do {
					System.out.println(valor +" x "+multiplicador+" = "+(valor * multiplicador));
					multiplicador++;
				} while(multiplicador <= 10);
				break;
				
			case 4:
				System.out.println("-- 4- Cadastrar cursos --");
				String[] cursos = new String [5];
				for(int i = 0; i < cursos.length; i++){
					System.out.println("Informe o curso: ");
					cursos[i] = tec.next();
					int controle = 0;
				do  {	
					System.out.println(cursos[i++]);
					controle++;
				} while (controle < cursos.length);
			}
				break;
			case 5:
				continuar = "n";
				break;
			
			default:
			System.out.println("Opção inválida.-");
			break;
			}
			
		} while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("Sistema encerrado.");
		
	}

}
