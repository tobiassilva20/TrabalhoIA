package distribuicoes;

public class Calculos {
	//Recebe os dados idade e altura e gera um vetor preenchido com dados que vao da idade até o altura.
	int[] gerarDados(int i, int a) {
		 int vet []; 
		 int v = a-i;
		 vet = new int [v+1];
		  
		 for (int x = 0; x<=v; x++) {
			 vet[x]=i;
			 i++;
		 }
		 return vet;
	}
	
	float calcularMedia(int[] a) {
		
		float total = 0;
		for(int x=0; x<= a.length-1;x++) {
			total = a[x] + total;
		}
		
		return total/a.length;
		
	}
	//Calculo do valor do desvio-padrao do conjunto a
	double calcularDesvioPadrao(int[] a) {
		int mi = 0;
		mi  = (int) calcularMedia(a);
		
			for(int x=0; x<=a.length-1;x++) {
				//calcula a distancia de cada elemento para a media
				a[x]= (a[x]-mi);
				//calcula o quadrado de cada elemento
				a[x]= (a[x]*a[x]);
			}
		//Calculo da segunda media do vetor dos quadrados
		mi = (int) calcularMedia(a);
		double dp = 0;
		dp= Math.sqrt(mi);		
		return dp;	
	}
	
}
