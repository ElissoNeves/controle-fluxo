//Aqui você ver uma implemetação com a utilização de dois menu´s utilizando o Switch Case junto o if e o else.

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);
        
        double saldo = 100.00;

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("\nDigite sua sigla: ");
        System.out.println("_______________MENU_______________");
        System.out.println("PJ");
        System.out.println("PF");
        System.out.println("CP");
        System.out.println("__________________________________");

        
        String sigla = scanner.next();
        
        switch (sigla) {
            case "PJ":
                System.out.println("Obrigado por ser nosso cliente OURO, " + nome + " em que posso ajudar? ");
                break;
            
            case "PF":
                System.out.println("Obrigado por ser nosso cliente PRATA, " + nome + " em que posso ajudar?");
                break;
            
            case "CP":
                System.out.println("Obrigado por ser nosso cliente BRONZE, " + nome + " em que posso ajudar?");
                break;
            
            default:
                break;
        }

        System.out.println("\nDigite a opção desejada: ");
        System.out.println("_______________MENU_______________");
        System.out.println("1: Sacar");
        System.out.println("2: Depositar");
        System.out.println("3: Saldo");
        System.out.println("4: Sair");
        System.out.println("__________________________________");

        String  opcao = scanner.next();
        
        switch (opcao) {
            case "1":{
                System.out.println("Informe o valor do saque: ");
                double valorSaque = scanner.nextDouble();
                double novoSaldo = saldo - valorSaque;
                if (valorSaque <= saldo) {
                    System.out.println("Saque realizado com sucesso");
                    System.out.println("Este é seu Saldo: " + novoSaldo);
                }else{System.out.println("Saldo insuficiente");
                        System.out.println("Este é seu Saldo: " + saldo);

                }
                break;
            }
            case "2":{
                System.out.println("Informe o valor do deposito: ");
                double valorDeposito = scanner.nextDouble();
                double novoSaldo = valorDeposito + saldo;
                System.out.println("Deposito realizado com sucesso");
                System.out.println("Este é seu novo saldo: " + novoSaldo);
                break;
            }
            case "3":{
                System.out.println("Seu saldo atual é: " + saldo);
                    break;
            }
            case "4":{
                System.out.println("Operação encerrada");
                    break;
            }
            default:
                break;
        }

        scanner.close();
    
    }
}
