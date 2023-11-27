package ecommerceAcessórios.model;

public class Bijuteria extends Produto {
	private int materialBiju;

	public Bijuteria(int id, int tipo, String nomeProduto, String categoria, float preco, int materialBiju) {
		super(id, tipo, nomeProduto, categoria, preco);
		this.setMaterialBiju(materialBiju);
	}

	public int getMaterialBiju() {
		return materialBiju;
	}

	public void setMaterialBiju(int materialBiju) {
		this.materialBiju = materialBiju;
	}
	public void visualizar() {
		super.visualizarProduto();
		System.out.println(" Material da Bijuteria: "+this.materialBiju);
	}
}



