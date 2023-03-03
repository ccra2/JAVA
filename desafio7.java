package newpackage;

import java.util.Scanner;

public class desafio7 {


 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor total da conta: ");
        double valorTotal = input.nextDouble();
        
        double valorSemCentavos = (int) (valorTotal / 3);
        double valorFelipe = valorTotal - 2 * valorSemCentavos;
        
        System.out.printf("Carlos deve pagar: R$%.2f\n", valorSemCentavos);
        System.out.printf("André deve pagar: R$%.2f\n", valorSemCentavos);
        System.out.printf("Felipe deve pagar: R$%.2f\n", valorFelipe);
    }
}

        
  



