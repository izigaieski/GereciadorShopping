public class Informatica extends Loja
{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos, int i)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String lojaInformática, int quantidadeFuncionarios, Endereco e1, Data d1, int i) {
        super(lojaInformática, quantidadeFuncionarios, e1, d1, 2);

    }

    public void setSeguroEletronicos(double seguroEletronicos)
    {
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos()
    {
        return seguroEletronicos;
    }


    @Override
    public String toString()
    {
        return "Informatica" +
                " Nome da Loja:" + getNome() + '\'' +
                " Quantidade Funcionarios:" + getQuantidadeFuncionarios() +
                " Salario base Funcionarios:" + getSalarioBaseFuncionario() +
                " Endereco:" + getEndereco() +
                " Data de Fundacao:" + getDataDeFundacao() +
                " Seguro Eletronicos:" + seguroEletronicos;
    }
}