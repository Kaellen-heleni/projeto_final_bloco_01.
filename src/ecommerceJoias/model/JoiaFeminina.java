package ecommerceJoias.model;

public class JoiaFeminina extends Produto {

	private String  feminina;

	public JoiaFeminina(String tipo, String material, String nomeProduto, int id, float preco) {
		super(tipo, material, nomeProduto, id, preco);
				this.feminina = feminina;
	}

	public String getFeminina() {
		return feminina;
	}

	public void setFeminina(String feminina) {
		this.feminina = feminina;
	}

}
