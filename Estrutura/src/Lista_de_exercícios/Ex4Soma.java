package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex4Soma {

    public static void main(String[] args) {

      //  System.out.println("Informe o primeiro número: ");
        //Scanner num = new Scanner(System.in);
        //int numero1 = num.nextInt();

        //System.out.println("\nInforme o segundo número: ");
        //int numero2 = num.nextInt();
        //num.close();

        //int soma = numero1+numero2;
//        System.out.println("\nA soma dos números " + numero1 + " e " +
//                numero2 + " é " + soma);

        String num1 = JOptionPane.showInputDialog(null,"Informe o primeiro número: ");
        int numero1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog(null,"Informe o segundo número: ");
        int numero2 = Integer.parseInt(num2);

        int soma = numero1+numero2;

        JOptionPane.showMessageDialog(null,"A soma dos números "+
                numero1 + " e " + numero2 + " é " + soma);







    }

}
