package Repository;

import Entity.Lote;

import java.util.HashMap;

public class LoteRepository {

    private HashMap<Integer, Lote> mapaLotes = new HashMap<>();

    public void addLote(Lote lote) {
        this.mapaLotes.put(lote.hashCode(), lote);
    }

    public HashMap<Integer, Lote> getMapaLotes() {
        return mapaLotes;
    }
}
