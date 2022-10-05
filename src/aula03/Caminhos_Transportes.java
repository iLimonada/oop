package aula03;

import javax.swing.*;

public class Caminhos_Transportes {

    public static void main (String args[]) {

        Meus_Transportes e = new Meus_Transportes();

        String tr1, mr1, md1, cr1, tr2, mr2, md2, cr2, pr, tr3;
        double pc;

        tr1 = JOptionPane.showInputDialog("Digite o transporte: ");
        mr1 = JOptionPane.showInputDialog("Digite a marca: ");
        md1 = JOptionPane.showInputDialog("Digite a modelo: ");
        cr1 = JOptionPane.showInputDialog("Digite a cor: ");
        tr2 = JOptionPane.showInputDialog("Digite o transporte: ");
        mr2 = JOptionPane.showInputDialog("Digite a marca: ");
        md2 = JOptionPane.showInputDialog("Digite a modelo: ");
        cr2 = JOptionPane.showInputDialog("Digite a cor: ");
        pr = JOptionPane.showInputDialog("Digite a preço: ");
        tr3 = JOptionPane.showInputDialog("Digite o transporte: ");


        pc = Double.parseDouble(pr);

        e.transporte1 = tr1;
        e.marca1 = mr1;
        e.modelo1 = md1;
        e.cor1 = cr1;
        e.transporte2 = tr2;
        e.marca2 = mr2;
        e.modelo2 = md2;
        e.cor2 = cr2;
        e.preco = pc;
        e.transporte3 = tr3;

        e.Informa_Transportes();
    }
}
