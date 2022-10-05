package Repository;
;
import Entity.Produto;

import java.util.HashMap;

public class ProdutoRepository {

    private HashMap<Integer, Produto> mapaProdutos = new HashMap<>();

    public void addProduto(Produto produto) {
        this.mapaProdutos.put(produto.hashCode(), produto);
    }

    public HashMap<Integer, Produto> getMapaProdutos() {
        return mapaProdutos;
    }
}
