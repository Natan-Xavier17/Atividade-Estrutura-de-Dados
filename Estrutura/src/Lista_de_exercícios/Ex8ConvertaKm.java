package Lista_de_exercícios;

import javax.swing.*;
import java.util.Scanner;

public class Ex8ConvertaKm {

    public static void main(String[] args) {

        //System.out.println("Digite uma distância em metros: ");
        //Scanner km = new Scanner(System.in);
        //int KM = km.nextInt();
        //km.close();

        //int cm = KM*100;
        //System.out.println("\nA conversão em metros é " + cm);

        String km = JOptionPane.showInputDialog(null,"Digite uma distância em metros: ");
        double kM = Double.parseDouble(km);

        double cm = kM*100;

        JOptionPane.showMessageDialog(null,"A conversão em metros é " + cm);


    }

}