package ecommerceAcessórios.model;

public class Joia extends Produto {
	private int material;
	public Joia(int id,int tipo, String nomeProduto, String categoria,  float preco, int material) {
		super(id, tipo, nomeProduto, categoria, preco);
		
	}
public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
public void visualizar() {
	super.visualizarProduto();
	System.out.println(" Material da Joia: "+this.material);
}
	}


	
  


