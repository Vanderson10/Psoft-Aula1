package Entity;

import java.util.Objects;

public class Lote {

    private int quantidade;
    private String dataValidade;
    private Produto produto;

    public Lote(int quantidade, String dataValidade, Produto produto) {
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "quantidade=" + quantidade +
                ", dataValidade='" + dataValidade + '\'' +
                ", produto=" + produto +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidade, dataValidade, produto);
    }
}
