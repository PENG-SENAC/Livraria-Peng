package br.senac.peng.livraria.dao;

import java.io.IOException;
import java.util.List;

import javax.annotation.processing.FilerException;

import br.senac.peng.livraria.dao.bancodados.BancoDeDados;
import br.senac.peng.livraria.model.Livro;

public class LivrariaDAO {
	private final String nomeBanco = "Livraria_Digital_DB";
	private BancoDeDados bancoDeDados;
	
	public LivrariaDAO(){
		try {
			bancoDeDados = new BancoDeDados( nomeBanco );
		} catch (FilerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void inserirLivro(Livro livro){
		bancoDeDados.inserirLivro(livro);
	}
	
	public List<Livro> listarLivros(){
		List<Livro> livros = bancoDeDados.listarLivros();		
		return livros;
	}

	
}
