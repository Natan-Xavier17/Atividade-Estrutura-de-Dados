package Lista_de_exercícios;

import java.util.Scanner;

public class Ex13NovoSalario {

    public static  void main(String[] args) {

        System.out.println("Informe seu nome: ");
        Scanner nome = new Scanner(System.in);
        String nomeFuncionario = nome.nextLine();

        System.out.println("Informe seu salário: ");
        double salarioFuncionario = nome.nextDouble();
        nome.close();

        int aumento = 15;
        double salAumento = (salarioFuncionario*aumento)/100;
        double newSal = salarioFuncionario+salAumento;

        System.out.println("\nO funcionário " + nomeFuncionario + " o seu salário é R$" +
                salarioFuncionario + " e receberá um aumento de 15%, fazendo com que seu salário aumente para R$" +
                newSal);




    }

}
