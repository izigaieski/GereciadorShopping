public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[capacidadeLojas];
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] loja){
        this.lojas = loja;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; // Não há espaço para inserir a loja.
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada.
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                // Verifica o tipo da loja com base na instância da classe
                if (loja instanceof Cosmetico && tipoLoja.equals("Cosmético")) {
                    count++;
                } else if (loja instanceof Vestuario && tipoLoja.equals("Vestuário")) {
                    count++;
                } else if (loja instanceof Bijuteria && tipoLoja.equals("Bijuteria")) {
                    count++;
                } else if (loja instanceof Alimentacao && tipoLoja.equals("Alimentação")) {
                    count++;
                } else if (loja instanceof Informatica && tipoLoja.equals("Informática")) {
                    count++;
                }
            }
        }

        if (count > 0) {
            return count;
        } else {

            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping");
        sb.append("\n Nome: ").append(nome);
        sb.append("\n Endereco: ").append(endereco);
        sb.append("\n Maximo de Lojas: ").append(lojas.length);

        // Adicionando informações sobre as lojas existentes
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append("\n - ").append(loja.getNome());
            }
        }

        return sb.toString();
    }
}

