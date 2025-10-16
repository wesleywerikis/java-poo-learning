package classe_e_objeto;

public class TesteClasseObjeto {
    public static void main(String[] args) {

        Livro livro1 = new Livro("A Bússola de Ouro", "Philip Pullman", "978-8578278234");
        Livro livro2 = new Livro("Java: Como Programar", "Deitel & Deitel", "978-8543026210");

        System.out.println("TESTE DE MODELAGEM PROFISSIONAL (LIVRO)");
        System.out.println("======================================");

        livro1.exibirDetalhes();

        System.out.println("\nRepresentação padrão (toString):");
        System.out.println(livro2);
    }
}
