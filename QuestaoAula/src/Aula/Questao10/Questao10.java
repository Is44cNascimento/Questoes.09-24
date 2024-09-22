package  Aula.Questao10;
/* bileteria do metro, criado por Isaac Nascimento de Jesus*/

import java.util.*;


public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int QuanBi;
        {
            System.out.println("Digite a quantidade de bilhete");
            System.out.println("|1 => Bilhete Unitário |2 => Bilhete Duplo |3 => Bilhete de 10 viagens|");

            QuanBi = sc.nextInt();
        }


        double valor;
        {
            System.out.println("Digite o valor colocado na maquina");
            valor = sc.nextInt();
        }


        double B1, B2, B3;
        {
            if (QuanBi == 1) {
                System.out.println("Calculando");
                B1 = valor - 2.00;
                    if (B1 > 0) {
                        System.out.println("Voce comprou um bilhete unico. Seu troco foi de: R$" + B1);
                    } else if (B1 < 0) {
                        System.out.println(" Saldo insulficiente, falta o valor de: R$" + B1);
                    }
            } else {
                if (QuanBi == 2) {
                    System.out.println("Calculando");
                       B1 = valor - 3.00;
                        if (B1 > 0) {
                            System.out.println("Voce comprou um bilhete duplo. Seu troco foi de: R$" + B1);
                        } else if (B1 < 0) {
                            System.out.println(" Saldo insulficiente, falta o valor de: R$" + B1);
                    }
                } else if (QuanBi == 3) {
                    System.out.println("Calculando");
                        B1 = valor - 12.00;
                        if (B1 > 0) {
                            System.out.println("Voce comprou um bilhete de 10 viagens. Seu troco foi de: R$" + B1);
                        } else {
                            if (B1 < 0) {
                            System.out.println(" Saldo insulficiente, falta o valor de: R$" + B1);
                    } else if ((QuanBi != 1 || QuanBi != 2 || QuanBi != 3) == true){
                            System.out.println("Digite uma quantidade valida!!!");
                        }

                    }
                }
            }
        }
    }
}