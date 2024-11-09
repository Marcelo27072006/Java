abstract class Funcionario {
    protected String nome;
    protected int idade;
    protected int idFuncionario;
    protected double salarioBase;

    public Funcionario(String nome, int idade, int idFuncionario, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.idFuncionario = idFuncionario;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamento();

    public String exibirDados() {
        return "ID: " + idFuncionario + ", Nome: " + nome + ", Idade: " + idade + ", Salário: " + salarioBase;
    }
}


class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double taxaPorHora;

    public FuncionarioHorista(String nome, int idade, int idFuncionario, double salarioBase, int horasTrabalhadas, double taxaPorHora) {
        super(nome, idade, idFuncionario, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * taxaPorHora;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Horas Trabalhadas(horista): " + horasTrabalhadas +
                ", Taxa por Hora: " + taxaPorHora + ", Pagamento Total: " + calcularPagamento();
    }
}

class FuncionarioMensalista extends Funcionario {
    private double bonus;

    public FuncionarioMensalista(String nome, int idade, int idFuncionario, double salarioBase, double bonus) {
        super(nome, idade, idFuncionario, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + bonus;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Bônus(Mensalista): " + bonus + ", Pagamento Total: " + calcularPagamento();
    }
}