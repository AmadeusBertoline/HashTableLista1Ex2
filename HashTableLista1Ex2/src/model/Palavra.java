package model;

public class Palavra {
	
	public String verbete;
	public String significado;
	
	@Override
	public String toString() {
		
		return "Palavra \nverbete= " + verbete + " \nsignificado=" + significado;
		
		
	}

	@Override
	public int hashCode() {
	
		int posicao = verbete.toLowerCase().charAt(0);
		posicao = posicao - 97;
		
		return posicao;
		
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
