package classe_e_objeto;

public class TesteClasseObjeto {
    public static void main(String[] args) {

        // =========================================================================
        // TESTE 1: LIVRO (Modelagem, Construtor e toString)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 1: MODELAGEM PROFISSIONAL (LIVRO)         ##");
        System.out.println("#####################################################");

        Livro livro1 = new Livro("A Bússola de Ouro", "Philip Pullman", "978-8578278234");
        Livro livro2 = new Livro("Java: Como Programar", "Deitel & Deitel", "978-8543026210");

        System.out.println("\n--- Exemplo de Uso do método exibirDetalhes() ---");
        livro1.exibirDetalhes();

        System.out.println("\n--- Exemplo de Uso de toString() implícito ---");
        // Java chama livro2.toString() automaticamente, demonstrando a sobrescrita.
        System.out.println("Representação do Objeto 2: " + livro2);

        System.out.println("\n=====================================================");


        // =========================================================================
        // TESTE 2: PRODUTO (Entidade, Comportamento e Encapsulamento)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 2: ENTIDADE E COMPORTAMENTO (PRODUTO)     ##");
        System.out.println("#####################################################");

        Produto notebook = new Produto(101, "Notebook Gamer Acer", 5000.00);
        System.out.println("-> [1] Estado Inicial: " + notebook);

        System.out.println("\n--- Aplicando Desconto ---");
        notebook.aplicarDesconto(10.0); // 10%
        System.out.println("-> [2] Após Desconto: " + notebook);

        System.out.println("\n--- Aplicando Aumento ---");
        notebook.aumentarPreco(5.0); // 5%
        System.out.println("-> [3] Após Aumento: " + notebook);

        System.out.println("\n--- Teste de Validação (Desconto Inválido) ---");
        notebook.aplicarDesconto(150.0);
        System.out.println("-> [4] Preço inalterado: " + notebook);

        System.out.println("\n=====================================================");
    }
}