package aula03;

import javax.swing.*;

public class Concessionaria {
    public static void main (String args[]) {

        Automovel auto = new Automovel();

        String mr, md, pr, cr;
        double pc;

        mr = JOptionPane.showInputDialog("Digite a marca: ");
        md = JOptionPane.showInputDialog("Digite a modelo: ");
        cr = JOptionPane.showInputDialog("Digite a cor: ");
        pr = JOptionPane.showInputDialog("Digite a preço: ");

        pc = Double.parseDouble(pr);

        auto.setMarca(mr);
        auto.setModelo(md);
        auto.setCor(cr);
        auto.setPreco(pc);


        JOptionPane.showMessageDialog(null, "DADOS AUTOMOVEL \n" +
                " Marca: " + auto.getMarca() +
                "\n Modelo: " + auto.getModelo() +
                "\n Cor: " + auto.getCor() +
                "\n Preco: " + auto.getPreco(), "", JOptionPane.PLAIN_MESSAGE);

        //auto.Informa_Auomovel();
    }
}
