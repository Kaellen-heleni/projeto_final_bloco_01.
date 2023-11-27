package ecommerceAcessórios.model;

public abstract class Produto {
	private String  nomeProduto, categoria;
	private int id, tipo;
	private float preco;
	
	
	public Produto( int id, int tipo, String nomeProduto, String categoria, float preco) {
		this.tipo = tipo;
		this.nomeProduto = nomeProduto;
		this.id = id;
		this.preco = preco;
		this.categoria = categoria;
		
	}
	public void visualizarProduto() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
		tipo = "Joia";
			break;
		case 2:
		tipo = "Bijuteria";
			break;
		}
	
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("ID do Produto: "+this.getId());
		System.out.println("Tipo do Produto: "+this.getTipo());
		System.out.println("Nome do Produto: "+this.getNomeProduto());
	    System.out.println("Esse acessório é uma:" +tipo);
		System.out.println("Valor do Produto: R$ "+this.getPreco());
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
	}

	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	

}
