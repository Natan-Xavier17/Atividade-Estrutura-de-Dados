package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex15Salario {

    public static void main(String[] args){

        //System.out.println("Digite os dias trabalhados");
        //Scanner mes = new Scanner(System.in);
        //int dias = mes.nextInt();
        //mes.close();

        //int salario = dias*200;

        //System.out.println("\nO salário ao final do mês por trabalhar por "+dias+" dias será R$"+ salario);

        String dias = JOptionPane.showInputDialog(null,"Digite os dias trabalhados: ");
        int dia = Integer.parseInt(dias);

        int salario = dia*200;

        JOptionPane.showMessageDialog(null,"O salário ao final do mês por trabalhar por "+dias+
                " dias será R$"+ salario);

    }

}
