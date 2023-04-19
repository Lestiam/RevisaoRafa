package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Ingresso{
    private Cliente cliente;
    private List<Ingresso> ingressos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String nomeDoJogo, Double valor, Integer quantidade, Cliente cliente, List<Ingresso> ingressos) {
        super(nomeDoJogo, valor, quantidade);
        this.cliente = cliente;
        this.ingressos = ingressos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public double calculaPedido() {
        //return super.getValor() * ingressos.size();
        return super.getValor() * getQuantidade();
    }
}
