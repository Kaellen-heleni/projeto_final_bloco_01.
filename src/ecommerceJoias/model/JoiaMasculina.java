package ecommerceJoias.model;

public class JoiaMasculina extends Produto {
    private String masculina;
	public JoiaMasculina(String tipo, String material, String nomeProduto, int id, float preco, String publico) {
		super(tipo, material, nomeProduto, id, preco);
		this.masculina = masculina;
	}
	public String getMasculina() {
		return masculina;
	}
	public void setMasculina(String masculina) {
		this.masculina = masculina;
	}

}
