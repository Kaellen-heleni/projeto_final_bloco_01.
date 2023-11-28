package ecommerceAcessórios.model;

public class Bijuteria extends Produto {
	private int materialBiju;

	public Bijuteria(int id, int tipo, String nomeProduto, int categoria, float preco, int materialBiju) {
		super(id, tipo, nomeProduto, categoria, preco);
		this.setMaterialBiju(materialBiju);
	}

	public int getMaterialBiju() {
		return materialBiju;
	}

	public void setMaterialBiju(int materialBiju) {
		this.materialBiju = materialBiju;
	}
	public void visualizarProduto() {
		String materialBiju ="";
		switch(this.materialBiju) {
		case 1: materialBiju ="Aço Inoxidável";
		break;
		case 2: materialBiju = "Folheada em Dourado";
		break;
		case 3: materialBiju = "Folheada em Prata";
		break;
		}
		super.visualizarProduto();
		System.out.println(" Material da Joia: "+materialBiju);
	}
		}

