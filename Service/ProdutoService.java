package Service;

import Entity.Produto;
import Repository.ProdutoRepository;

import java.util.HashMap;

public class ProdutoService {

    private ProdutoRepository repository;

    public ProdutoService() {
        this.repository = new ProdutoRepository();
    }

    public void createProduto(String nome, String fabricante, double preco) {
        Produto produto = new Produto(nome, fabricante, preco);
        this.repository.addProduto(produto);
    }

    public String listarProdutos() {
        String lista = "";
        for (Produto produto : repository.getMapaProdutos().values()) {
            lista = produto.toString() + "/n";
        }
        return lista;
    }

}
