public class animal {
    private String nome;
    private String especie;
    private int idade;

    public animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void dadosAnimais() {
        System.out.println("Nome : " + this.nome);
        System.out.println("Especie: " + this.especie);
        System.out.println("Idade: " + this.idade);
    }

    public void mudarIdade(int atualizarIdade) {
        this.idade = atualizarIdade;
    }
}