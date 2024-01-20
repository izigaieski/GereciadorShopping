public class Alimentacao extends Loja
{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara, int estoqueProdutos)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String lojaAlimentacao, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco e1, Data d1, int i) {
        super(lojaAlimentacao, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1);
    }

    public void setDataAlvara(Data dataAlvara)
    {
        this.dataAlvara = dataAlvara;
    }
    public Data getDataAlvara()
    {
        return dataAlvara;
    }



    @Override
    public String toString()
    {
        return "Alimentacao" +
                " Nome da Loja:" + getNome() + '\'' +
                " Quantidade Funcionarios:" + getQuantidadeFuncionarios() +
                " Salario base Funcionarios:" + getSalarioBaseFuncionario() +
                " Endereco:" + getEndereco() +
                " Data de Fundacao:" + getDataDeFundacao() +
                " Data Alvara:" + dataAlvara;
    }
}