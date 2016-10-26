
public class Exercicio {
	int totalReceitas, totalDespesas;
	public Exercicio() {
		// TODO Auto-generated constructor stub
		
		CalcularReceitas();
		CalcularDespesas();
		CalcularLucro();

	}
	
	public void CalcularReceitas() {
		int quotas = 300, recbaile = 200, recbar = 250;
		totalReceitas = quotas + recbaile + recbar;
		System.out.println("Receita: "+totalReceitas+"€");
	}
	
	public void CalcularDespesas() {
		int agua = 100, luz = 60, telefone = 70;
		totalDespesas = agua + luz + telefone;
		System.out.println("Despesa: "+totalDespesas+"€");
	}
	
	public void CalcularLucro() {
		int Lucro = totalReceitas - totalDespesas;
		System.out.println("Lucro: "+Lucro+"€");
	}

}
