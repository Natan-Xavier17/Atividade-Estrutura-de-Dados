package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex2Boas_Vindas {

    public static void main(String[] args) {

//        System.out.println("Informe seu nome: ");
        //      Scanner nome = new Scanner(System.in);
        //String nomeFuncionario = nome.nextLine();
        //nome.close();

        //System.out.println("Seja bem-vindo " + nomeFuncionario);

        String name = JOptionPane.showInputDialog(null,"Informe seu nome: ");
        JOptionPane.showMessageDialog(null,"Seja bem-vindo "+ name);


    }

}
