package sistema_vendas;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();


        Eletronico eletronico = new Eletronico("Smartphone", 2999.0, 24, 3);
        Roupa roupa = new Roupa("Saia", 39.99, "M", "Rosa", 6);
        Alimento alimento = new Alimento("Arroz", 9.99, "12/2024", 4);

        carrinho1.adicionarItem(eletronico);
        carrinho1.adicionarItem(roupa);
        carrinho1.adicionarItem(alimento);

        System.out.println("Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total: " + carrinho1.calcularTotal());

        carrinho1.gerarArquivoTexto("carrinho1.txt");

        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        Roupa blusa = new Roupa("Blusa", 20.0, "G", "Azul", 2);
        Alimento macarrao = new Alimento("Macarrão", 5.49, "01/2025", 10);

        carrinho2.adicionarItem(blusa);
        carrinho2.adicionarItem(macarrao);

        // Listar produtos e total do segundo carrinho
        System.out.println("Carrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total: " + carrinho2.calcularTotal());

        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}