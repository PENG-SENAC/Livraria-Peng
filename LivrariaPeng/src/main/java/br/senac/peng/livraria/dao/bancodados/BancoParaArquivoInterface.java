
package br.senac.peng.livraria.dao.bancodados;

import java.util.List;

import br.senac.peng.livraria.model.Livro;

public interface BancoParaArquivoInterface {

	public List<Livro> listarLivros();
	
	public void inserirLivro(Livro livro);
	
	public void removerLivro(String id);

}
