package Controller;

import Entity.Produto;
import Service.LoteService;

public class LoteController {

    private LoteService service;

    public LoteController() {
        this.service = new LoteService();
    }

    public void createLote(int quantidade, String dataValidade, Produto produto) {
        this.service.createLote(quantidade, dataValidade, produto);
    }

    public void listarLote(){
        System.out.println(this.service.listarLote());
    }

}
