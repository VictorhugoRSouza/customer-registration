package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraCliente {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		
	while(true) {
			
		
		System.out.println("---Cadastro de Clientes---");
		System.out.println("---Selecione a opção desejada---");
		System.out.println("1: Cadastrar");
		System.out.println("2: Consultar");
		System.out.println("3: Sair da Aplicação");
		
		int opcaoDesejada = sc.nextInt();
		
		switch(opcaoDesejada) {
			case 1:
				sc.nextLine();
				System.out.println("Digite o nome do nosso cliente");
				String nome = sc.nextLine();
				System.out.println("Digite o sobrenome do nosso cliente");
				String sobrenome = sc.nextLine();
				
				clientes.add(new Cliente(nome, sobrenome));
				break;
			case 2:
				clientes.forEach(item -> System.out.println(item.getNome() + " " + item.getSobrenome()));
				break;
			case 3:
				System.exit(opcaoDesejada);
			
		}
		}
}

}
