package distribuicoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculos c = new Calculos();
		Scanner sc = new Scanner(System.in);
		int id = 0, al =0;
		System.out.print("Idade:");
		id = sc.nextInt();
		System.out.print("altura:");
		al = sc.nextInt();
		sc.close();
		int []a = c.gerarDados(id, al);
		Funcoes f = new Funcoes();
		f.calcularDistNormal(a);
		
		
			
		
		
		
		
		
		
	}

}
