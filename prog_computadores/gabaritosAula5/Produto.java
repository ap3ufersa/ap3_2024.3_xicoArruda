import java.util.*;

public class Produto {
    private ? codigo;
    private ? nome;
    private ? quantidadeMinimaEstoque;
    private ? quantidadeEmEstoque;

    public Produto(? codigo, ? nome, ? quantidadeMinimaEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeMinimaEstoque = quantidadeMinimaEstoque;
        this.quantidadeEmEstoque = 0;
    }

    public void adicionarEstoque(? quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(? quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
        }
    }

    public boolean verificarEstoqueMinimo() {
        return quantidadeEmEstoque >= quantidadeMinimaEstoque;
    }

    public ? getCodigo() {
        return codigo;
    }

    public ? getNome() {
        return nome;
    }

    public ? getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public ? getQuantidadeMinimaEstoque() {
        return quantidadeMinimaEstoque;
    }
}