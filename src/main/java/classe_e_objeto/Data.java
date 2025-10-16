package classe_e_objeto;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.ano = ano;

        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else  {
            this.mes = 1;
            System.out.println("Aviso: Mês inválido (" + mes + "). Definido para 1 (Janeiro).");
        }
    }

    public String formatar(String separador){
        return String.format("%02d%s%02d%s%d", dia, separador, mes, separador, ano);
    }

    public String toString(){
        return formatar("/");
    }
}
