package main;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Doador;
import vo.TipoSanguineo;



public class Database {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Doador> doadores = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		int option = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			menu();
			option = entrada.nextInt();
			
			switch (option) {
			case 1: {
				
				addDoador();
				break;
			}
			case 2: {
				addDoacao();
				break;
			}
			
			case 3: {
				getSituacaoEstoque();
				break;
			}
			
			case 4: {
				fim();
				break;
			}
			
			default:
				System.out.println("Opa��o Inv�lida!!!");
			}
			
		}while(option != 0 || option == 0);
	}
	

	private static void addDoador() {
		// TODO Auto-generated method stub
		System.out.println("Voce escolheu a op��o cadastrar Doador");
		
		Doador doador = new Doador();
		
		System.out.println("Digite o CPF: ");
		String a = sc.nextLine();
		doador.getCpf();

		if(doadores.contains(doador)) {
			System.out.println("Erro ao cadastrar Doador." + 
						"CPF j� existe!");
		}else {
			doadores.add(doador);
			System.out.println("Doador cadastrado com sucesso!");
		}
		
	}

	private static void addDoacao() {
		// TODO Auto-generated method stub
		System.out.println("Voce escolheu a op��o cadastrar doa��o");
		
		TipoSanguineo tipoSanguineo = new TipoSanguineo();
		long quantidade = 0;
		
		System.out.println("Digite o Tipo Sangu�neo: ");
		String a = sc.nextLine();
		tipoSanguineo.getTipoSanguineo();
		
		for(int i = 0; i > quantidade; i++) {
			if(tipoSanguineo != null) {
				System.out.println("Tipo Sangu�neo " + tipoSanguineo.getTipoSanguineo());
			}
		}
		
	}
	
	

	private static void getSituacaoEstoque() {
		// TODO Auto-generated method stub
		
	}
	
	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1 - Cadastrar Doador");
		System.out.println("2 - Cadastrar Doa��o");
		System.out.println("3 - Mostrar Estoque");		
	}

	
	private static void fim() {
		// TODO Auto-generated method stub
		
	}



}
