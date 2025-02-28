package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex6Ante_e_Suce {

    public static void main(String[] args) {

     //   System.out.println("Informe um número inteiro: ");
//        Scanner num = new Scanner(System.in);
        //      int numero = num.nextInt();
        //num.close();

        //int sucessor = numero + 1;
        //int antecessor = numero - 1;
        //System.out.println("O número " + numero + " tem como sucessor e antecessor " + sucessor + " e "  + antecessor);

        String numero = JOptionPane.showInputDialog(null,"Informe um número inteiro: ");
        int num = Integer.parseInt(numero);

        int ant = num-1;
        int suc = num+1;

        JOptionPane.showMessageDialog(null,"O número " + num +
                " tem como sucessor e antecessor " + suc + " e "  + ant);



    }

}
