package classe_e_objeto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private String id;
    private double valor;
    private LocalDateTime dataHora;

    public Transacao(double valor){
        this.valor = valor;
        this.id = "TRX-" + String.format("%08X", (int) (System.currentTimeMillis() % 100000000));
        this.dataHora = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Transacao {" +
                "ID: " + id +
                ", Valor: R$" + String.format("%.2f", valor) +
                ", Data/Hora: " + dataHora.format(formatter) +
                "}";
    }
}
