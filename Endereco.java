public class Endereco {
    private String nomeDaRua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;



    public Endereco(String nomeDaRua, String numero, String complemento, String cep, String cidade, String estado, String pais) {
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;


    }




    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }


    @Override
    public String toString() {
        return "Endereco" +
                " Nome da Rua: " + nomeDaRua + "\n" +
                " Numero: " + numero + "\n" +
                " Complemento: " + complemento + "\n" +
                " CEP: " + cep + "\n" +
                " Cidade: " + cidade + "\n" +
                " Estado: " + estado + "\n" +
                " Pais: " + pais;

    }

}