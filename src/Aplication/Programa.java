package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.contaCorrente;

public class Programa {
		public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
			
				contaCorrente cc;
				System.out.print(" Informe o Numero da Conta : ");
				int numCC = sc.nextInt();
				System.out.print(" Informe o Nome : ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print(" gostaria de efetuar o deposito incial s/n : ");
				char indDeposito = sc.next().charAt(0);
				
				if (indDeposito == 's' ) {
					System.out.print(" Informe o valor que gostaria de depostitar inicialmente ");   
					double depositoInt = sc.nextDouble();
					 cc = new contaCorrente(nome, numCC, depositoInt);
	     			}
				else {					
					cc = new contaCorrente(nome, numCC);
				}
				System.out.println();
				System.out.println("Dados da Conta:");
				System.out.println(cc.ToString());
				
				System.out.println();			
				System.out.println("Informe o Valor que do deposito :");
				double vlrDeposito = sc.nextDouble();
				cc.deposito(vlrDeposito);
				System.out.println("Dados da conta atualizado :");
				System.out.println(cc.ToString());
				
				System.out.println();
				System.out.println("Informe o Valor que do Saque :");
				double vlrSaque = sc.nextDouble();
				cc.saque(vlrSaque);
				System.out.println("Dados da conta atualizado :");
				System.out.println(cc.ToString());
				sc.close();	
		}
				
}
