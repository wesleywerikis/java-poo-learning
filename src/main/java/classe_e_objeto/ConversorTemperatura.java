package classe_e_objeto;

/**
 * Classe de utilitário (utility class) que utiliza métodos estáticos.
 * Não deve ser instanciada.
 */
public class ConversorTemperatura {
    private ConversorTemperatura(){
    }

    /**
     * Converte temperatura de Celsius para Fahrenheit.
     * Fórmula: F = C * 9/5 + 32
     * @param celsius Temperatura em Celsius.
     * @return Temperatura em Fahrenheit.
     */
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Converte temperatura de Fahrenheit para Celsius.
     * Fórmula: C = (F - 32) * 5/9
     * @param fahrenheit Temperatura em Fahrenheit.
     * @return Temperatura em Celsius.
     */
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}
