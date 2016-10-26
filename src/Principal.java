
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int quotas = 300, recbaile = 200, recbar = 250;
		int totalReceitas = quotas + recbaile + recbar;
		System.out.println("Receita: "+totalReceitas);
		int agua = 100, luz = 60, telefone = 70, totalDespesas;
		totalDespesas = agua + luz + telefone;
		System.out.println("Despesa: "+totalDespesas);
		int Lucro = totalReceitas - totalDespesas;
		System.out.println("Lucro: "+Lucro);
	}

}
