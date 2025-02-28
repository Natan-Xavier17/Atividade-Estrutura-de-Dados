package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;
import java.text.NumberFormat;


public class Ex3NomeSalario {

    public static void main(String [] args) {
        //     System.out.println("Informe seu nome: ");
        //Scanner nome = new Scanner(System.in);
        //String nomeFuncionario = nome.nextLine();

//        System.out.println("Informe seu salário: ");
//        double salarioFuncionario = nome.nextDouble();
//        nome.close();

//        System.out.println("O funcionário " +  nomeFuncionario + " tem um salário de R$" +
//                NumberFormat.getCurrencyInstance().format(salarioFuncionario));

        String nome = JOptionPane.showInputDialog(null,"Informe seu nome: ");
        String sal = JOptionPane.showInputDialog(null,"Informe seu salário: ");
        double salario = Double.parseDouble(sal);

        JOptionPane.showMessageDialog(null,"Olá "+ nome + " seu salário é " + salario);



    }

}
