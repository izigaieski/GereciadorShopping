public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Configurando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }



    public Data(Data outraData) {
        this.dia = outraData.dia;
        this.mes = outraData.mes;
        this.ano = outraData.ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
        } else {
            System.out.println("Data inválida");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(dia, mes, ano)) {
            this.mes = mes;
        } else {
            System.out.println("Data inválida");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(dia, mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Data inválida");
        }
    }




    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto()
    {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
        {
            return true; // É bissexto
        } else
        {
            return false; // Não é bissexto
        }
    }



    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int maxDias;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDias = 30;
        } else if (mes == 2) {
            maxDias = verificaAnoBissexto() ? 29 : 28;
        } else {
            maxDias = 31;
        }

        return dia >= 1 && dia <= maxDias;
    }
}

