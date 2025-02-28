package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex16Desafio {

    public static void main(String[] args){

        //System.out.println("Digite a quantidade de cigarros fumadas por dia: ");
        //Scanner vida = new Scanner(System.in);
        //int cigas = vida.nextInt();

        //System.out.println("\nQuanto tempo você fuma? ");
        //int anos = vida.nextInt();
        //vida.close();

        //int timeDay = anos*365;
        //int cigasDay = cigas*timeDay;
        //int dayLost = (cigasDay*10)/1440;

        //System.out.println("Você perdeu "+dayLost+" e "+timeDay+" e "+dayLost);

        String cigarro = JOptionPane.showInputDialog(null,"Digite a quantidade de cigarros usados por dia: ");
        int cigas = Integer.parseInt(cigarro);

        String ano = JOptionPane.showInputDialog(null,"Digite há quantos anos você fuma: ");
        int anos = Integer.parseInt(ano);

        int timeDay = anos*365;
        int cigasDay = cigas*timeDay;
        int dayLost = (cigasDay*10)/1440;

        JOptionPane.showMessageDialog(null,"Você perdeu "+dayLost+" dias de sua vida");

    }


}
