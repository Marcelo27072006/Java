public class processarDadosProdutos {
    public static void main(String[] args) {
        produto produto = new produto("detergente", 5);

    produto.dadosEstoque();
    System.out.println("\nAdicionando quantidade em estoque\n");
    produto.adcionarEstoque(4);
    produto.dadosEstoque();

    System.out.println("\nCaso contenha valor negativo do estoque\n");
    produto.removerEstoque(10);

    System.out.println("\nAtualizando dados do estoque em caso de erro\n");
    produto.atualizarEstoque(5);
    produto.dadosEstoque();

    System.out.println("\nRemovendo valor corretamente do estoque\n");
    produto.removerEstoque(3);
    produto.dadosEstoque();
    }
}
