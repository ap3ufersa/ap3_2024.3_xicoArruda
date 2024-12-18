import java.util.*;

class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getCodigo() + " adicionado ao estoque.");
    }

    public void removerProduto(String codigo, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                produto.removerEstoque(quantidade);
                System.out.println("Produto " + codigo + " removido do estoque.");
            }
        }
    }

    public int verificarEstoqueProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                if (produto.verificarEstoqueMinimo()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Criando produtos
        for (int i = 1; i <= ?; i++) {
            ? codigo = "P00" + i; // "P001", "P002"...
            ? nome = "Produto " + i;
            ? qtdMinimaEstoque = 5 + i; // Quantidade de 5 a 15

            Produto produto = new Produto(codigo, nome, qtdMinimaEstoque);
            estoque.adicionarProduto(produto);
        }

        System.out.println("\nProdutos no estoque:");
        for (Produto produto : estoque.produtos) {
            String statusEstoqueMinimo;
            if (produto.verificarEstoqueMinimo()) {
                statusEstoqueMinimo = "Estoque Suficiente";
            } else {
                statusEstoqueMinimo = "Estoque Insuficiente";
            }
            System.out.println("Código: " + produto.getCodigo() + ", Nome: " + produto.getNome() +
                               ", Estoque: " + produto.getQuantidadeEmEstoque() +
                               ", Quantidade Mínima: " + produto.getQuantidadeMinimaEstoque() +
                               ", Status: " + statusEstoqueMinimo);
        }
    }
}
