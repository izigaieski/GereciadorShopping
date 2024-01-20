public class Vestuario extends Loja
{
    private boolean produtosImportados;
    private Produto[] estoqueProdutos;
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados,int estoqueProdutos)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.produtosImportados = produtosImportados;
        this.estoqueProdutos = new Produto[10];
    }

    public void setProdutosImportados(boolean produtosImportados)
    {
        this.produtosImportados = produtosImportados;
    }
    public boolean getProdutosImportados()
    {
        return produtosImportados;
    }



    @Override
    public String toString()
    {
        return "Vestuario" +
                " Nome da Loja: " + getNome() +
                " Quantidade Funcionarios: " + getQuantidadeFuncionarios() +
                " Salario base Funcionarios: " + getSalarioBaseFuncionario() +
                " Endereco: " + getEndereco() +
                " Data de Fundacao: " + getDataDeFundacao() +
                "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}