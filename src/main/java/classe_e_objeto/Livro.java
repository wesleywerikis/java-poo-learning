package classe_e_objeto;

/**
 * Representa um livro com informações básicas.
 * Demonstra encapsulamento e construtor parametrizado.
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    // 2. Construtor Parametrizado
    /**
     * Construtor para inicializar todos os atributos do livro.
     * @param titulo O título do livro.
     * @param autor O autor principal do livro.
     * @param isbn O número ISBN único do livro.
     */
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // 3. Método toString() (Representação padrão/Sobrescrita)
    /**
     * Sobrescreve o método padrão toString() da classe Object.
     * Retorna uma representação legível do objeto Livro.
     */
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                '}';
    }

    // 4. Método exibirDetalhes() que utiliza o toString()
    /**
     * Exibe os detalhes do livro no console, utilizando a representação
     * gerada pelo método toString().
     */
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Livro ---");
        System.out.println(this.toString());
        System.out.println("-------------------------");
    }
}
