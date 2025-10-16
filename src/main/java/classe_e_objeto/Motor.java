package classe_e_objeto;

public class Motor {
    private boolean ligado;

    public Motor() {
        this.ligado = ligado;
    }

    public void ligar(){
        if (!this.ligado){
            this.ligado = true;
            System.out.println("Motor ligado com sucesso.");
        } else {
            System.out.println("Motor já está ligado.");
        }
    }

    public void desligar(){
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("Motor já está desligado.");
        }
    }

    public String status(){
        return this.ligado ? "Motor ligado." : "Motor desligado.";
    }

    @Override
    public String toString() {
        return "Motor {" + status() + "}";
    }
}
