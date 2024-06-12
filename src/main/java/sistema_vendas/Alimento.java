package sistema_vendas;

public class Alimento  extends ProdutoBase {
    private String dataValidade;

    // Construtor com parâmetros
    public Alimento(String nome, double preco, String dataValidade, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    // Construtor padrão
    public Alimento() {
        super();
        this.dataValidade = "";
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String getTipo() {
        return "Alimento";
    }

    @Override
    public String exibirDetalhes() {
        return getTipo() + " - " + getNome() + ": Preço = " + getPreco() +
                ", Data de Validade = " + dataValidade + ", Quantidade = " + getQuantidade();
    }
}
