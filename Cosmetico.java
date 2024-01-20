public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int i, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String lojaCosmetico, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco e1, Data d1, int i) {
        super(lojaCosmetico, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1);
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico" +
                " Nome da Loja'" + getNome() + '\'' +
                " Quantidade Funcionarios:" + getQuantidadeFuncionarios() +
                " Salario base Funcionarios:" + getSalarioBaseFuncionario() +
                " Endereco:" + getEndereco() +
                " Data de Fundacao:" + getDataDeFundacao() +
                " Taxa Comercializacao" + taxaComercializacao;
    }
}
