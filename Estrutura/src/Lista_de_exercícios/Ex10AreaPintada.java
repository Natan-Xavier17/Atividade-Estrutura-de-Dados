package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex10AreaPintada {

    public static void main(String[] args){

        //System.out.println("Digite a altura da parede: ");
        //Scanner area = new Scanner(System.in);
        //double altura = area.nextDouble();

        //System.out.println("\nDigite a largura da parede: ");
        //double largura = area.nextDouble();
        //area.close();

        //double parede = altura*largura;
        //double tinta = parede/2;


        //System.out.println("\nA parede tem " + String.format("%.1f",largura) + " metros de largura e " +
        //      String.format("%.1f",altura) + " metros de altura tendo " + String.format("%.1f",parede)
        //      + " de metros quadrados e gastará " + String.format("%.1f",tinta) + " de tinta");

        String altura = JOptionPane.showInputDialog(null,"Digite a altura da parede: ");
        double alt = Double.parseDouble(altura);

        String largura = JOptionPane.showInputDialog(null,"Digite a largura da parede: ");
        double larg = Double.parseDouble(largura);

        double parede = alt*larg;
        double tinta = parede/2;


        JOptionPane.showMessageDialog(null,"A parede tem "+String.format("%.1f",larg)+
                " metros de largura e "+String.format("%.1f",alt)+" metros de altura tendo "+String.format("%.1f",parede)
                +" de metros quadrados e gastará "+String.format("%.1f",tinta)+" de tinta");
    }


}
