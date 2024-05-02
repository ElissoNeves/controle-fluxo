//Aqui você tem uma condição com a implementação do if e do else


import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);
        
        double saldo = 100.00;

        System.out.println("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso. Seu saldo é " + saldo);
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println("Este é seu saldo atual: " + saldo);
            System.out.println("Volte e realize uma nova tentativa de saque");
        }

        scanner.close();
    
    }
}
