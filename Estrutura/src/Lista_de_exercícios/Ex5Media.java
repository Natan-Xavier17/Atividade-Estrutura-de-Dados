package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex5Media {

    public static void main(String[] args){

       // System.out.println("Digite o nome do aluno: ");
        //Scanner nota = new Scanner(System.in);
        //String nomeAluno = nota.nextLine();


        //System.out.println("Informe a primeira nota: ");
        //int notaAluno = nota.nextInt();

        //System.out.println("Informe a segunda nota: ");
        //int nota2Aluno = nota.nextInt();
        //nota.close();

        //int media = (notaAluno+nota2Aluno)/2;
        //System.out.println("\nAs notas do aluno " + nomeAluno +
//                " e as notas são " + notaAluno + " e " + nota2Aluno +
        //              " a média é " + media);

        String nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");

        String nota = JOptionPane.showInputDialog(null,"Digite a primeira nota: ");
        double nota1 = Double.parseDouble(nota);

        String nota2 = JOptionPane.showInputDialog(null,"Digite a segunda nota: ");
        double nota22 = Double.parseDouble(nota2);

        double media = (nota1+nota22)/2;

        JOptionPane.showMessageDialog(null,"A média do aluno "+ nome+ " é " +
                media);


    }

}
