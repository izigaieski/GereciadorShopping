import java.util.Arrays;
public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private int tamanhoEstoque;



    private Produto[] estoqueProdutos = new Produto[2];


    public Produto[] getCopiaEstoqueProdutos() {
        return Arrays.copyOf(estoqueProdutos, estoqueProdutos.length);
    }


    public Loja(String nomeLoja, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int tamanhoEstoque) {


        this.nome = nomeLoja;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.tamanhoEstoque = tamanhoEstoque;
        estoqueProdutos = new Produto[tamanhoEstoque];

    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco e1, Data d1, int i) {
        this.nome = nome;
        this.endereco = e1;
        this.salarioBaseFuncionario = -1.0;
        this.dataDeFundacao = d1;
    }


    public Loja(String nomeLoja, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco e1, Data d1) {
        this.nome = nomeLoja;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = e1;
        this.dataDeFundacao = d1;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios = 5;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataDeFundacao() {
        return dataDeFundacao;
    }


    public void setDataDeFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return Arrays.copyOf(estoqueProdutos, estoqueProdutos.length);
    }


    public void setEstoqueProdutos(Produto[] tamanhoEstoque) {
        estoqueProdutos = tamanhoEstoque;
    }


    @Override
    public String toString() {
        return "Loja" +
                "\n Nome da Loja: " + nome + '\'' +
                "\n Quantidade funcionarios: " + quantidadeFuncionarios +
                "\n Salario base funcionarios: " + salarioBaseFuncionario +
                "\n Endereco: " + getEndereco() +
                "\n Data de fundacao: " + dataDeFundacao +
                "\n Número de Produtos no Estoque: " + countProdutosNoEstoque() +
                "\n Tamanho da Loja: " + tamanhoDaLoja();

    }


    public void imprimeProdutos() {
        System.out.println("Produtos na loja " + nome + ":");
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }

        System.out.println("Não foi possível adicionar o produto. Estoque cheio.");
        return false; // Estoque está cheio
    }

    private int countProdutosNoEstoque() {
        int count = 0;
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                count++;
            }
        }
        return count;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado no estoque
    }


    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Não é possível calcular os gastos com salário
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }



}



