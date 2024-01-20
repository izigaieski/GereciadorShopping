public class Bijuteria extends Loja
{
    private double metaVendas;
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double metaVendas, int estoqueProdutos)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.metaVendas = metaVendas;

    }

    public Bijuteria(String lojaBijuteria, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco e1, Data d1, int metaVendas, int i) {
        super(lojaBijuteria, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1);
    }

    public void setMetaVendas(double metaVendas)
    {
        this.metaVendas = metaVendas;
    }
    public double getMetaVendas()
    {
        return metaVendas;
    }




    @Override
    public String toString()
    {
        return "Bijuteria" +
                " Nome da Loja" + getNome() + '\'' +
                " Quantidade Funcionarios:" + getQuantidadeFuncionarios() +
                " Salario base Funcionarios:" + getSalarioBaseFuncionario() +
                " Endereco:" + getEndereco() +
                " Data de Fundacao:" + getDataDeFundacao() +
                " Meta Vendas:" + metaVendas;
    }
}