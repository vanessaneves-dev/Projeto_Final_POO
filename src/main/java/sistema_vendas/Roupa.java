package sistema_vendas;

public class Roupa extends ProdutoBase{
    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, String tamanho, String cor, int quantidade){
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Roupa(){
        super();
        this.tamanho = "";
        this.cor = "";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getTipo() {
        return "Roupa";
    }

    @Override
    public String exibirDetalhes() {
        return getTipo() + " - " + getNome() + ": Preço = " + getPreco() +
                ", Tamanho = " + tamanho + ", Cor = " + cor + ", Quantidade = " + getQuantidade();
    }
}
