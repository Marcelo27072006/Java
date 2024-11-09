public class exibirDados {
    public static void main(String[] args) {
        Funcionario Horista = new FuncionarioHorista("Emily", 30, 1, 2000, 160, 15);
        Funcionario Mensalista = new FuncionarioMensalista("Marcelo", 45, 2, 3000, 500);

        System.out.println(Horista.exibirDados());
        System.out.println(Mensalista.exibirDados());
    }
}