package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex9Dolar {

    public static void main(String[] args) {

        //System.out.println("Quanto dinheiro você possui? ");
        //Scanner dolar = new Scanner(System.in);
        //double dol = dolar.nextDouble();
        //dolar.close();

        //double real = dol/5.70;

        //System.out.println(String.format("\nO dinheiro que está na sua carteira (R$" + dol +
        //      ") convertendo para o dólar atual seria " + "%.2f",real));
        //5,703

        String dolar = JOptionPane.showInputDialog(null,"Quanto dinheiro você possui? ");
        double dol = Double.parseDouble(dolar);

        double real = dol/5.70;
        JOptionPane.showMessageDialog(null,"O dinheiro que está na sua carteira (R$" + dol +
                ") convertendo para o dólar atual seria $" + String.format("%.2f",real));


    }

}
