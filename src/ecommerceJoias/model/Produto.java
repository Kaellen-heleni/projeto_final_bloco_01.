package ecommerceJoias.model;

public abstract class Produto {
	private String tipo, material, nomeProduto;
	private int id;
	private int  publico;
	private float preco;
	
	public Produto(String tipo, String material, String nomeProduto, int id, float preco) {
		this.tipo = tipo;
		this.material = material;
		this.nomeProduto = nomeProduto;
		this.id = id;
		this.preco = preco;
		this.publico = publico;
	}
	public void visualizarProduto() {
		String publico = "";
		
		switch(this.publico) {
		case 1:
		publico = "Feminino";
			break;
		case 2:
		publico = "Masculino";
			break;
		}
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("ID do Produto: "+this.getId());
		System.out.println("Tipo do Produto: "+this.getTipo());
		System.out.println("Nome do Produto: "+this.getNomeProduto());
	    System.out.println("Material do Produto: "+this.getMaterial());
	    System.out.println("Público principal do Produto: "+publico);
		System.out.println("Valor do Produto: R$ "+this.getPreco());
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
	}

	public int getPublico() {
		return publico;
	}
	public void setPublico(int publico) {
		this.publico = publico;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	

}
