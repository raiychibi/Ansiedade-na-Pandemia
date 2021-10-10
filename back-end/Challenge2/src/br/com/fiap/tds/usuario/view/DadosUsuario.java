package br.com.fiap.tds.usuario.view;

import java.util.Scanner;

import br.com.fiap.tds.challenge.bean.Aluno;

public class DadosUsuario {

	
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um email para cadastro: ");
		String email = leitor.next() + leitor.nextLine();
		
		System.out.println("digite um senha para cadastro; ");
		String senha = leitor.next() + leitor.nextLine();
		
		System.out.println("digite sua data de nascimento: ");
		String dataNascimento = leitor.next() + leitor.nextLine();
		
		System.out.println("digite seu genero Mulher/Homem/ Não binario: ");
		String genero = leitor.next() + leitor.nextLine();
		
		System.out.println("digite seu telefone: ");
		String telefone = leitor.next() + leitor.nextLine();
		
		System.out.println("Qual seu cursoo atual?: ");
		String curso = leitor.next() + leitor.nextLine();
		
		System.out.println("digite o numero da sua matricula: ");
		int numeroMatricula = leitor.nextInt();
		
		System.out.println("Informe seu grau de Humor Bom/Normal/Ruim: ");
		String grauHumor = leitor.next() + leitor.nextLine();
		
		System.out.println("Informe seu grau de Ansiedade Leve/Medio/Grave: ");
		String grauAnsiedade = leitor.next() + leitor.nextLine();
		
		Aluno aluno = new Aluno(email, senha, dataNascimento, genero, telefone, curso, numeroMatricula, grauHumor, grauAnsiedade);
		
		String dados = aluno.Cadastro();
		
		System.out.println(dados);
		
		System.out.println("Informe seu grau de Humor depois do site Bom/Normal/Ruim: ");
		String grauHumor2 = leitor.next() + leitor.nextLine();
		if(grauHumor.equalsIgnoreCase("BOM") && grauHumor2.equalsIgnoreCase("NORMAL")) {
			System.out.println("O Aluno piorou em grau de Humor");
		}else if (grauHumor.equalsIgnoreCase("BOM") && grauHumor2.equalsIgnoreCase("RUIM")) {
			System.out.println("O Aluno piorou em grau de Humor");
		}else if (grauHumor.equalsIgnoreCase("NORMAL") && grauHumor2.equalsIgnoreCase("RUIM")) {
			System.out.println("O Aluno piorou em grau de Humor");
		}else if (grauHumor.equalsIgnoreCase("NORMAL") && grauHumor2.equalsIgnoreCase("RUIM")) {
			System.out.println("O Aluno piorou em grau de Humor");
		}else if (grauHumor.equalsIgnoreCase("RUIM") && grauHumor2.equalsIgnoreCase("BOM")) {
			System.out.println("O Aluno melhorou em grau de Humor");
		}else if (grauHumor.equalsIgnoreCase("RUIM") && grauHumor2.equalsIgnoreCase("NORMAL")) {
			System.out.println("O Aluno melhorou em grau de Humor");
		}else {
			System.out.println("O Aluno manteve o seu grau de Humor");
		}
		
		System.out.println("Informe seu grau de Ansiedade depois de usar o site Leve/Medio/Grave: ");
		String grauAnsiedade2 = leitor.next() + leitor.nextLine();
		if(grauAnsiedade.equalsIgnoreCase("LEVE") && grauAnsiedade2.equalsIgnoreCase("MEDIO")) {
			System.out.println("O Aluno piorou em grau de Ansiedade");
		}else if (grauAnsiedade.equalsIgnoreCase("MEDIO") && grauAnsiedade2.equalsIgnoreCase("GRAVE")) {
			System.out.println("O Aluno piorou em grau de Ansiedade");
		}else if (grauAnsiedade.equalsIgnoreCase("GRAVE") && grauAnsiedade2.equalsIgnoreCase("LEVE")) {
			System.out.println("O Aluno melhorou em grau de Ansiedade");
		}else if (grauAnsiedade.equalsIgnoreCase("GRAVE") && grauAnsiedade2.equalsIgnoreCase("MEDIO")) {
			System.out.println("O Aluno melhorou em grau de Ansiedade");
		}else if (grauAnsiedade.equalsIgnoreCase("GRAVE") && grauAnsiedade2.equalsIgnoreCase("LEVE")) {
		
		}else {
			System.out.println("O Aluno manteve o seu grau de Ansiedade");
		}
	    
		
	    
	}
}
