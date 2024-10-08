public class produto {
    private String nome;
    private int qntd_Estoque;

    public produto(String nome, int qntd_Estoque) {
        this.nome = nome;
        this.qntd_Estoque = qntd_Estoque;
    }

    public void dadosEstoque() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade em estoque: " + this.qntd_Estoque);
    }

    public void adcionarEstoque(int adicionarEstoque) {
        if (qntd_Estoque > 0) {
            this.qntd_Estoque = (this.qntd_Estoque + adicionarEstoque);
        }
        else {
            System.out.println("Quantidade inválida no estoque!");
        }
    }

    public void removerEstoque(int removerEstoque) {
        if (qntd_Estoque > 0) {
            this.qntd_Estoque = (this.qntd_Estoque - removerEstoque);
        }
        else {
            System.out.println("Quantidade inválida no estoque!");
        }
    }
    public void atualizarEstoque(int estoqueAtualizado) {
        System.out.println("Quantidade de estoque atualizada:");
        this.qntd_Estoque = estoqueAtualizado;
    }
}
