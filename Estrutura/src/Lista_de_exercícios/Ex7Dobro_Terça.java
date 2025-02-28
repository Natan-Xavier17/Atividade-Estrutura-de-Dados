package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex7Dobro_Terça {

    public static void main(String[] args){

        //System.out.println("Digite um número: ");
        //Scanner num = new Scanner(System.in);
        //double numero = num.nextDouble();
        //num.close();

        //double dobro = numero*2;
        //double terca = numero/3;

        //System.out.println("\nO número " + numero + " tem como dobro e terça " + dobro + " e " + terca);

        String numero = JOptionPane.showInputDialog(null,"Digite um número: ");
        double num = Double.parseDouble(numero);

        double dobro = num*2;
        double terca = num/3;

        JOptionPane.showMessageDialog(null,"O número " + numero + " tem como dobro e terça " + dobro +
                " e " + String.format("%.2f", terca));


    }

}
