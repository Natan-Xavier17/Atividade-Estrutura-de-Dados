package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex11Delta {

    public static void main(String[] args){

        //System.out.println("Digite o valor de A: ");
        //Scanner delta = new Scanner(System.in);
        //int a = delta.nextInt();

        //System.out.println("\nDigite o valor de B: ");
        //int b = delta.nextInt();

        //System.out.println("\nDigite o valor de C: ");
        //int c = delta.nextInt();
        //delta.close();


        //int delta1 = (b*b)-(4*a*c);

        //System.out.println("\nOs valores de A: "+a+" B:"+b+" e C:"+
        //c+" tem como Delta:"+delta1);

        String a = JOptionPane.showInputDialog(null,"Digite o valor de a: ");
        int aa = Integer.parseInt(a);

        String b = JOptionPane.showInputDialog(null,"Digite o valor de b: ");
        int bb = Integer.parseInt(b);

        String c = JOptionPane.showInputDialog(null,"Digite o valor de c: ");
        int cc = Integer.parseInt(c);

        int delta1 = (bb*bb)-(4*aa*cc);

        JOptionPane.showMessageDialog(null,"Os valores de A:"+a+" B:"+b+" e C:"+c+
                " tem como Delta:"+delta1);


    }

}
