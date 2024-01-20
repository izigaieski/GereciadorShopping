public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    private int tamanhoEstoque;
    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;

    }

    public Produto(int tamanhoEstoque){
        this.tamanhoEstoque = tamanhoEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    public void setDataDeValidade(Data dataDeValidade)
    {
        this.dataDeValidade = dataDeValidade;
    }

    public Data getDataDeValidade()
    {
        return dataDeValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        // Verifica se a data atual é posterior à data de validade do produto
        if (dataDeValidade != null && dataAtual != null) {
            if (dataAtual.getAno() > dataDeValidade.getAno()) {
                return true; // Ano atual é posterior à data de validade
            } else if (dataAtual.getAno() == dataDeValidade.getAno()) {
                if (dataAtual.getMes() > dataDeValidade.getMes()) {
                    return true; // Mes atual é posterior à data de validade no mesmo ano
                } else if (dataAtual.getMes() == dataDeValidade.getMes()) {
                    if (dataAtual.getDia() > dataDeValidade.getDia()) {
                        return true; // Dia atual é posterior à data de validade no mesmo mês e ano
                    }
                }
            }
        }
        return false; // Produto não está vencido
    }

    @Override
    public String toString() {
        return "Produto" +
                " Nome Produto: " + nome + '\'' +
                " Preco" + preco +
                " Validade:" + dataDeValidade;


    }
}
