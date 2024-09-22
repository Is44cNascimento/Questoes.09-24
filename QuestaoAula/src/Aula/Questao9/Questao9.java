package  Aula.Questao9;
/* credito especial, criado por Isaac Nascimento de Jesus*/

import java.util.*;


public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bem, vindo a calculadora de credito especial");


        String nome;
        {
            System.out.println("Digite o seu nome por favor!");
            nome = sc.nextLine();
        }

        double saldoM;
        {
            System.out.println("Digite o seu saldo medio, com todos os numeros (Exemplo: 123,45/120,00): ");
            saldoM = sc.nextDouble();
        }


        double VC, TC, QC;
        {
            if (saldoM <= 0.00 || saldoM <= 200.00) {
                System.out.println(" Infelizmente no momento voce nao possui credito disponivel.");
            } else {
                if (saldoM <= 200.01 || saldoM <= 400.00) {
                        VC = saldoM + (saldoM * 0.20);
                        System.out.println("Voce pode pegar credito ate 20%, o valor de: R$" + VC);
                    } else {
                        if (saldoM <= 400.01|| saldoM <=600.00) {
                                TC = saldoM + (saldoM * 0.30);
                                System.out.println("Voce pode pegar credito ate 30%, o valor de: R$" + TC);
                            } else if (saldoM >= 600.01) {
                                        QC = saldoM + (saldoM * 0.40);
                                        System.out.println("Voce pode pegar credito ate 40%, o valor de: R$" + QC);
                            }
                    }
            }
        }
    }
}