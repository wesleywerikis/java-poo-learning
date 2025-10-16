package classe_e_objeto;

public class ItemPedido {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal(){
        return quantidade * precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return String.format("%s (x%d) | Unitário: R$%.2f | Subtotal: R$%.2f",
                nome, quantidade, precoUnitario, calcularSubtotal());
    }
}
