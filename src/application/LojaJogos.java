package application;

import entities.Cliente;
import entities.Ingresso;
import entities.Pedido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LojaJogos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Ingresso ingresso ;
        Pedido pedido = new Pedido();
        //pedido.setIngressos(new ArrayList<>());

        try {
            char ch = 'a';
            do {
                ch = JOptionPane.showInputDialog(null, "Deseja o ingresso de outro jogo além do jogo atual? ", "Jogo"
                        , JOptionPane.PLAIN_MESSAGE).toUpperCase().charAt(0);
                String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente: ", "Nome"
                        , JOptionPane.PLAIN_MESSAGE);
                if (nome.matches((".*\\d.*"))) {
                    throw new Exception("Inválido! Contém números, digite apenas letras");
                }
                cliente.setNome(nome);

                String jogo = JOptionPane.showInputDialog(null, "Informe o nome do jogo: ", "Jogo"
                        , JOptionPane.PLAIN_MESSAGE);

                if (jogo.matches((".*\\d.*"))) {
                    throw new Exception("Inválido! Contém números, digite apenas letras");
                }
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe o valor do jogo: ", "Valor"
                        , JOptionPane.PLAIN_MESSAGE));

                int quantidade = Integer.parseInt((JOptionPane.showInputDialog(null, " Informe a quantidade de ingresssos: ", "Quantidade"
                        , JOptionPane.PLAIN_MESSAGE)));
                ingresso = new Ingresso(jogo, valor, quantidade);
                pedido.setQuantidade(quantidade);

                pedido.setValor(valor);

                String mensagem = "Pedido feito para " + cliente.getNome() + "\n"
                        + ingresso.getQuantidade() + " Ingressos: " + ingresso.getNomeDoJogo()
                        + "\nValor: " + String.format("%.2f", pedido.calculaPedido());

                JOptionPane.showMessageDialog(null, mensagem, "Valor do pedido:", JOptionPane.PLAIN_MESSAGE);

                //pedido.setQuantidade(quantidade);
            }
            while (ch == 'S');

        }catch (NumberFormatException ex1) {
            JOptionPane.showMessageDialog(null,"Digite apenas números!", "Excessão",JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Excessão", JOptionPane.ERROR_MESSAGE);
        }
        sc.close();
    }
}
