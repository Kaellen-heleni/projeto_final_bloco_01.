package ecommerceAcessórios.model;

public class Joia extends Produto {
	private int material;
	public Joia(int id,int tipo, String nomeProduto, int categoria,  float preco, int material) {
		super(id, tipo, nomeProduto, categoria, preco);
		this.setMaterial(material);
		
	}
public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
public void visualizarProduto() {
	String materialJoia ="";
	switch(this.material) {
	case 1: materialJoia ="Ouro";
	break;
	case 2: materialJoia = "Prata";
	break;
	case 3: materialJoia = "Zircônia";
	break;
	}
	super.visualizarProduto();
	System.out.println(" Material da Joia: "+materialJoia);
}
	}


	
  


