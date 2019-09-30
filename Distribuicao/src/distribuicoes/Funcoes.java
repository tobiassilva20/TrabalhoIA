package distribuicoes;

//Classe responsavel por criar o calculo da funcao de distribuicao normal
public class Funcoes {
	
	//Metodo da função de distribuição normal
	void calcularDistNormal(int[]a) {
		int [] aux = new int[a.length];
		Calculos calculos = new Calculos();
		
		double mi = calculos.calcularMedia(a); //Calculo da media
		for (int x=0; x <= a.length-1; x++) {
			aux[x] = a[x];
		}
		double dp = calculos.calcularDesvioPadrao(a); //Calculo do desvio padrao
		System.out.println(dp);
		double v1 = 1/(dp*Math.sqrt(2*Math.PI)); // Primeira parte da formula, 1 sobre desvio padrao X 2 x Pi
		
		double []fx = new double [a.length];
		double valor2;
		
		for (int x=0; x <= a.length-1; x++) {
			valor2 = (a[x] - mi)/(2*(dp*dp)); //Segunda parte da formula, x menos a media sobre 2 X a variancia
			valor2 = valor2 * -1;
			fx[x] = v1 * Math.pow(Math.E,valor2 ); // Multiplicando as partes valor 1 x Euler a menos valor 2
			
			System.out.println("x ="+ aux[x]+ " -> f(x)= " + fx[x]);
		}
	}
	
	void calcularDistBinomial(int[] a) {
		
	}
	
	void calcularDistUniforme(int[] a) {
		
	}
	void calcularDistPoisson(int[] a) {
		
	}
}
