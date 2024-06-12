package sistema_vendas;

public interface Produto {

        String getTipo();
        String getNome();
        double getPreco();
        int getQuantidade();

        void setNome(String nome);
        void setPreco(double preco);
        void setQuantidade(int quantidade);

        String exibirDetalhes();

}
