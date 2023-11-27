package ecommerceAcessórios.repository;

import ecommerceAcessórios.model.Produto;

public interface JoiasRepository {
	public void cadastrarProdutos(Produto produto);
	public void listarProdutos();
	public void buscarProduto (int id);
	public void atualizarProduto (Produto produto);
	public void deletarProduto (int id);
	public void visualizarProduto(int id);

}
