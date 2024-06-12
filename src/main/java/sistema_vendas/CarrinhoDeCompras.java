package sistema_vendas;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Adicionar produto
    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    // Remover produto
    public void removerItem(Produto produto) {
        itens.remove(produto);
    }

    // Listar itens no carrinho
    public void listarItens() {
        for (Produto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    // Exportar a lista de produtos
    public List<Produto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    // Calcular o total do carrinho
    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    // Gerar relatório em arquivo de texto
    public void gerarArquivoTexto(String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            // Cabeçalho do arquivo
            writer.write(String.format("%-5s %-5s %-15s %-10s %-10s\n", "Item", "Qtd", "Nome", "Preço", "SubTotal"));

            int itemNum = 1;
            for (Produto produto : itens) {
                double subtotal = produto.getPreco() * produto.getQuantidade();
                // Escrevendo cada linha com formatação apropriada
                writer.write(String.format("%-5d %-5d %-15s %-10.2f %-10.2f\n", itemNum, produto.getQuantidade(), produto.getNome(), produto.getPreco(), subtotal));
                itemNum++;
            }
            // Total
            writer.write(String.format("\n%-35s %-10.2f\n", "Total:", calcularTotal()));
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
