package Service;

import Entity.Lote;
import Entity.Produto;
import Repository.LoteRepository;

public class LoteService {

    private LoteRepository repository;

    public LoteService() {
        this.repository = new LoteRepository();
    }

    public void createLote(int quantidade, String dataValidade, Produto produto) {
        Lote lote = new Lote(quantidade, dataValidade, produto);
        this.repository.addLote(lote);
    }

    public String listarLote() {
        String lista = "";
        for (Lote lote : repository.getMapaLotes().values()) {
            lista = lote.toString() + "/n";
        }
        return lista;
    }

}
