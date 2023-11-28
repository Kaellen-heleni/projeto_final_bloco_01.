package ecommerceAcessórios.controller;

import java.util.ArrayList;

import ecommerceAcessórios.Cores;
import ecommerceAcessórios.model.Produto;
import ecommerceAcessórios.repository.JoiasRepository;

public class ProdutoController implements JoiasRepository {
private ArrayList<Produto>  listaProdutos = new ArrayList<Produto>();
int id =0;

	@Override
	public void cadastrarProdutos(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\n O Produto "+Cores.TEXT_YELLOW_BOLD+produto.getNomeProduto()+Cores.TEXT_RESET+" foi cadastrado no sistema com sucesso!");
	}

	@Override
	public void listarProdutos() {
for (var produto : listaProdutos) {
	produto.visualizarProduto();
}
		
	}
public int gerarId() {
	return ++id;
}
	@Override
	public void buscarProduto(int id) {
		var produto = buscarNaCollection(id);
				if (produto != null)
					produto.visualizarProduto();
				else
					System.out.println("\nO Produto de ID "+Cores.TEXT_YELLOW_BOLD+id+Cores.TEXT_RESET+" não foi encontrado. \nPor favor, cadastre o produto no sistema!");
	}

	@Override
	public void atualizarProduto(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("O Produto de ID "+id+" foi atualizado em sistema!");
		}else
			System.out.println("\nO Produto que deseja atualizar não foi encontrado. \nPor favor, primeiro cadastre o Produto no sistema!");		
	}
	@Override
	public void deletarProduto(int id) {
				var produto = buscarNaCollection(id);
				if(produto != null) {
					if(listaProdutos.remove(produto)== true)
						System.out.println("O Produto de ID "+id+" foi deletado com sucesso");
				}else
					System.out.println("O Produto de ID "+id+" não foi encontrado! \nSolicite um Produto que já foi cadastrado.");
				}
	
	public Produto buscarNaCollection (int id) {
		for(var produto : listaProdutos) {
			if(produto.getId()== id) {
				return produto;
			}}
		return null;
	}

	@Override
	public void visualizarProduto(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null)
			produto.visualizarProduto();
		
		
	}
	

}
