package Controller;

import Service.ProdutoService;

public class ProdutoController {

    private ProdutoService service;

    public ProdutoController() {
        this.service = new ProdutoService();
   }

   public void createProduto(String nome, String fabricante, double preco) {
        this.service.createProduto(nome, fabricante, preco);
   }

    public void listarProduto(){
        System.out.println(this.service.listarProdutos());
    }

}
