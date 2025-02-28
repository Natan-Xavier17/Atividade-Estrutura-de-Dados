package Lista_de_exercícios;

import java.util.Scanner;

public class Ex14Aluguel {

    public static void main(String[] args){

        System.out.println("Digite quantos dias utilizou o carro: ");
        Scanner aluguel = new Scanner(System.in);
        int dia = aluguel.nextInt();

        System.out.println("Digite quantos KM rodou: ");
        double km = aluguel.nextDouble();
        aluguel.close();

        double dias = dia*90;
        double kms = km*0.20;

        double total = dias+kms;

        System.out.println("\nA quantidade de dias foram "+dia+" e percorreu "+km+
                " custando assim "+total);



    }


}
