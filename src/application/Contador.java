package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		
		try {
			int parametroUm = terminal.nextInt();
			int parametroDois = terminal.nextInt();
			contar(parametroUm,parametroDois);
		}
		catch(InputMismatchException e){
				System.out.println("Digite um parâmetro válido!");
		}
		terminal.close();
	}	
		
	static void contar(int parametroUm, int parametroDois){
		
		if (parametroUm > parametroDois) {
			int contagem =parametroUm;
			for(int i = parametroUm;i<=parametroUm ;i++) {
				System.out.println(contagem);
				contagem--;	
			}
		}else {
			int contagem =parametroUm;
			for(int i = parametroUm;i<=parametroDois;i++) {
				System.out.println(contagem);
				contagem++;
			}	
		}
	}
}

