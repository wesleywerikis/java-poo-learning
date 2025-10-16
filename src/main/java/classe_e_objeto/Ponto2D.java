package classe_e_objeto;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calcula a distância euclidiana entre o ponto atual e outro ponto.
     * Fórmula: Distancia = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * @param outroPonto O ponto de destino.
     * @return A distância euclidiana.
     */
    public double calcularDistancia(Ponto2D outroPonto){
        double deltaX = outroPonto.x - this.x;
        double deltaY = outroPonto.y - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString(){
        return String.format("Ponto2D (x=%.2f, y=%.2f)", x, y);
    }
}
