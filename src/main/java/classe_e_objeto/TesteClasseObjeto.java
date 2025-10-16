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

        // =========================================================================
        // TESTE 3: CÍRCULO (Construtores Sobrecargados e Métodos Matemáticos)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 3: CÍRCULO (Construtores e Matemática)    ##");
        System.out.println("#####################################################");

        Circulo circuloPadrao = new Circulo(); // Construtor Padrão (raio = 1.0)
        Circulo circuloGrande = new Circulo(5.5); // Construtor Parametrizado

        System.out.printf("\nCírculo Padrão (%s) - Área: %.2f | Perímetro: %.2f\n",
                circuloPadrao, circuloPadrao.calcularArea(), circuloPadrao.calcularPerimetro());
        System.out.printf("Círculo Grande (%s) - Área: %.2f | Perímetro: %.2f\n",
                circuloGrande, circuloGrande.calcularArea(), circuloGrande.calcularPerimetro());

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 4: PESSOA E ENDEREÇO (Agregação Simples)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 4: PESSOA E ENDEREÇO (Agregação)          ##");
        System.out.println("#####################################################");

        Endereco end1 = new Endereco("Av. Paulista, 1000", "São Paulo");
        Pessoa p1 = new Pessoa("Ana Silva", "10/05/1995", end1);

        p1.exibirInformacoes();

        System.out.println("\nRepresentação da Pessoa: " + p1);

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 5: MOTOR (Controle de Estado)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 5: MOTOR (Controle de Estado Booleano)    ##");
        System.out.println("#####################################################");

        Motor m1 = new Motor();
        System.out.println("-> [1] Estado Inicial: " + m1.status());

        m1.ligar();
        System.out.println("-> [2] Após ligar: " + m1.status());

        m1.ligar(); // Tenta ligar novamente (deve falhar)

        m1.desligar();
        System.out.println("-> [3] Após desligar: " + m1.status());

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 6: DATA (Construtor com Fail-safe e Formatação)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 6: DATA (Validação e Formatação)          ##");
        System.out.println("#####################################################");

        Data dataValida = new Data(25, 12, 2024);
        Data dataInvalida = new Data(10, 15, 2025); // Mês 15 (Inválido)

        System.out.println("\nData Válida: " + dataValida.formatar("/"));
        System.out.println("Data Inválida (Fail-safe): " + dataInvalida.formatar("-"));

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 7: CONVERSOR TEMPERATURA (Métodos Estáticos)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 7: CONVERSOR (Métodos Estáticos)          ##");
        System.out.println("#####################################################");

        double celsius = 30.0;
        double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
        System.out.printf("30.0°C convertidos para Fahrenheit: %.2f°F\n", fahrenheit);

        double celsiusConvertido = ConversorTemperatura.fahrenheitParaCelsius(fahrenheit);
        System.out.printf("%.2f°F convertidos de volta para Celsius: %.2f°C\n", fahrenheit, celsiusConvertido);

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 8: TRANSAÇÃO (Modelagem de Processo - Geração Automática)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 8: TRANSAÇÃO (Geração Automática)         ##");
        System.out.println("#####################################################");

        Transacao t1 = new Transacao(150.75);
        Transacao t2 = new Transacao(50.00);

        System.out.println("\nTransação 1 (Gerada automaticamente): " + t1);
        System.out.println("Transação 2 (Gerada automaticamente): " + t2);

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 9: PEDIDO E ITEM (Integração e Listas)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 9: PEDIDO E ITEM (Integração e Listas)    ##");
        System.out.println("#####################################################");

        Pedido meuPedido = new Pedido();
        meuPedido.adicionarItem(new ItemPedido("Monitor LED", 1, 1250.00));
        meuPedido.adicionarItem(new ItemPedido("Teclado Mecânico", 2, 300.50));

        meuPedido.exibirItens();
        System.out.printf("\nVALOR TOTAL DO PEDIDO: R$%.2f\n", meuPedido.calcularTotal());

        System.out.println("\n=====================================================");

        // =========================================================================
        // TESTE 10: PONTO 2D (Cálculo Baseado em Objeto)
        // =========================================================================
        System.out.println("\n#####################################################");
        System.out.println("## TESTE 10: PONTO 2D (Cálculo de Distância)       ##");
        System.out.println("#####################################################");

        Ponto2D pA = new Ponto2D(1.0, 1.0);
        Ponto2D pB = new Ponto2D(4.0, 5.0);

        double distancia = pA.calcularDistancia(pB);

        System.out.println("\nPonto A: " + pA);
        System.out.println("Ponto B: " + pB);
        System.out.printf("Distância Euclidiana entre A e B: %.2f\n", distancia); // Deve ser 5.00

        System.out.println("\n=====================================================");
        System.out.println("### FIM DOS TESTES DE CLASSE E OBJETO ###");
    }
}