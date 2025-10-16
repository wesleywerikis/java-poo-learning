package classe_e_objeto;

public class Circulo {
    private double raio;
    private static final double PI = Math.PI;

    public Circulo(){
        this.raio = 1.0;
        System.out.println("Circulo criado com raio padrão: 1.0");
    }

    public Circulo(double raio) {
        if (raio <= 0) {
            System.out.println("Aviso: Raio deve ser positivo. Usando valor padrão (1.0).");
            this.raio = 1.0;
        } else {
            this.raio = raio;
        }
    }

    public double calcularArea() {
        return PI * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * PI * raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo {Raio: %.2f}", raio);
    }
}
