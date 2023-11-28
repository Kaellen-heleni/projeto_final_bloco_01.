package ecommerceAcessórios.model;

public abstract class Produto {
	private String  nomeProduto;
	private int id, tipo, categoria;
	private float preco;
	
	
	public Produto( int id, int tipo, String nomeProduto, int categoria, float preco) {
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
		String tipoProduto = "";
		switch(this.categoria) {
		case 1:
			tipoProduto =" Colar";
			break;
		case 2: tipoProduto = "Anel";
		break;
		case 3: tipoProduto = "Pulseira";
		break;
		case 4: tipoProduto = "Brinco";
		break;
			
		}
		
	
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("ID do Produto: "+this.getId());
		System.out.println("Tipo do Produto: "+tipoProduto);
		System.out.println("Nome do Produto: "+this.getNomeProduto());
	    System.out.println("Esse acessório é uma:" +tipo);
		System.out.println("Valor do Produto: R$ "+this.getPreco());
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
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	

}
