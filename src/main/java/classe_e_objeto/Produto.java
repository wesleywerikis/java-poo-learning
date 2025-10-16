package classe_e_objeto;

/**
 * Representa um produto em estoque com funcionalidades de ajuste de preço.
 * Demonstra encapsulamento e métodos de manipulação de estado.
 */
public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    // Construtor Parametrizado
    /**
     * Construtor para inicializar um novo produto.
     * @param codigo O código único do produto.
     * @param nome O nome do produto.
     * @param preco O preço inicial do produto.
     */
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = Math.max(0, preco);
    }

    // 2. Comportamento: Aplicar Desconto
    /**
     * Aplica um desconto percentual ao preço atual do produto.
     * @param percentual O percentual de desconto a ser aplicado (ex: 10.0 para 10%).
     */
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double fatorDesconto = 1 - (percentual / 100.0);
            this.preco = this.preco * fatorDesconto;
            System.out.println("Desconto de " + percentual + "% aplicado. Novo preço: R$" + String.format(
                    "%.2f", this.preco
            ));
        } else {
            System.out.println("Erro: Percentual de desconto inválido.");
        }
    }

    // 3. Comportamento: Aumentar Preço
    /**
     * Aumenta o preço do produto em um percentual especificado.
     * @param percentual O percentual de aumento (ex: 5.0 para 5%).
     */
    public void aumentarPreco(double percentual) {
        if (percentual > 0) {
            double fatorAumento = 1 + (percentual / 100.0);
            this.preco = this.preco * fatorAumento;
            System.out.println("Aumento de " + percentual + "% aplicado. Novo preço: R$" + String.format("%.2f", this.preco));
        } else {
            System.out.println("Erro: Percentual de aumento deve ser positivo.");
        }
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
