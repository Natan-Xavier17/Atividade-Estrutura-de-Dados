package Lista_de_exercícios;

import java.util.Scanner;

public class Ex12ProdutoPromo {

    public static void main(String[] args){

        System.out.println("Digite o valor do produto: ");
        Scanner promo = new Scanner(System.in);
        double produto = promo.nextDouble();
        promo.close();

        double desconto = (produto*5)/100;
        double proDes = produto-desconto;

        System.out.println("\nO valor do produto é R$"+produto+" e com uma promoção de 5% fica por R$"+
                proDes);




    }


}
