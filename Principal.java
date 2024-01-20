public class Principal {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Loja loja = null;
        Produto produto = null;

        Data dataAtual = new Data(20, 10, 2023); // Data de referência para verificar se o produto está vencido

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.leInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome da loja: ");
                    String nomeLoja = teclado.leString();
                    System.out.println("Informe a quantidade de funcionários: ");
                    int quantidadeFuncionarios = teclado.leInt();
                    System.out.println("Informe o salário base dos funcionários: ");
                    double salarioBaseFuncionario = teclado.leDouble();

                    System.out.println("Informe nome da rua");
                    String rua = teclado.leEndereco();
                    System.out.println("Informe o numero");
                    String numero = teclado.leEndereco();
                    System.out.println("Informe o complemento");
                    String complemento = teclado.leEndereco();
                    System.out.println("Informe o cep");
                    String cep = teclado.leEndereco();
                    System.out.println("Informe a cidade");
                    String cidade = teclado.leEndereco();
                    System.out.println("Informe o estado");
                    String estado = teclado.leEndereco();
                    System.out.println("Informe o pais");
                    String pais = teclado.leEndereco();




                    System.out.println("Informe o dia de fundação:  ");
                    String diaF = teclado.leData();
                    System.out.println("Informe o mês de fundação:  ");
                    String mesF = teclado.leData();
                    System.out.println("Informe o ano de fundação:  ");
                    String anoF = teclado.leData();

                    System.out.println("Tamanho do Estoque: ");
                    int tamanhoEstoque = teclado.leInt();


                    Endereco endereco = new Endereco(rua, numero,complemento,cep, cidade,estado, pais);
                    Data dataDeFundacao = new Data(Integer.parseInt(diaF),Integer.parseInt(mesF),Integer.parseInt(anoF));



                    // Crie a loja com os dados fornecidos
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, tamanhoEstoque);

                    System.out.println("Loja criada:");
                    System.out.println(loja);

                    break;
                case 2:
                    System.out.print("Informe o nome do produto: ");
                    String nomeProduto = teclado.leString();
                    System.out.print("Informe o preço do produto: ");
                    double precoProduto = teclado.leDouble();

                    System.out.println("Informe o dia de validade: ");
                    int dia = teclado.leInt();
                    System.out.println("Informe o mês de validade:  ");
                    int mes = teclado.leInt();
                    System.out.println("Informe o ano de validade:  ");
                    int ano = teclado.leInt();

                    // Crie o produto com os dados fornecidos
                    Data dataDeValidade = new Data(dia, mes, ano);
                    produto = new Produto(nomeProduto, precoProduto, dataDeValidade);

                    System.out.println("Produto criado:");
                    System.out.println(produto);

                    // Verifique se o produto está vencido
                    if (produto.estaVencido(dataAtual)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}