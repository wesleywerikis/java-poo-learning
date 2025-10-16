package classe_e_objeto;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;

    public Pessoa(String nome, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: [" + endereco.toString() + "]");
    }

    @Override
    public String toString(){
        return String.format("Pessoa {Nome: %s, Endereço: %s}", nome, endereco.getCidade());
    }
}
