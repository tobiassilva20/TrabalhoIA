package distribuicoes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculos c = new Calculos();
		int id = 34 , al =170;
		int []a = c.gerarDados(id, al);
		
		double b = c.calcularDesvioPadrao(a);
		for(int x=0; x<=al-id; x++) {
			//System.out.println(b[x]);
		}
		//obtendo a media mi do conjunto a
		//float mi= c.calcularMedia(b);
		
		//System.out.println("A media e:" + mi);
		
		
	}

}
