package classe_e_objeto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
        System.out.println("Item adicionado: " + item.getNome());
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println("--- Itens do Pedido ---");
        if (itens.isEmpty()){
            System.out.println("O pedido está vazio.");
        } else {
            for (ItemPedido item : itens) {
                System.out.println(" - " + item);
            }
        }
    }
}

