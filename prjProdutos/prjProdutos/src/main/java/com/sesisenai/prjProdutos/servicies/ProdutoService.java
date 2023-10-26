package com.sesisenai.prjProdutos.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesisenai.prjProdutos.entities.Produto;
import com.sesisenai.prjProdutos.repositories.ProdutpRepository;

@Service
public class ProdutoService {
private final ProdutpRepository produtoRepository;
@Autowired

public ProdutoService (ProdutpRepository produtoRepository) {
	this.produtoRepository = produtoRepository;
}
	
public Produto saveProduto(Produto produto) {
	return produtoRepository.save(produto);
}

public List<Produto> getAllProdutos(){
	return produtoRepository.findAll();
}

public Produto getProductById(Long id) {
	return produtoRepository.findById(id).orElse(null);		
	
}
public void deleteProduto(long id) {
	produtoRepository.deleteById(id);
	
}

}
