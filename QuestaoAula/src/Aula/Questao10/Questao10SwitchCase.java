package  Questao10;


import java.util.*;


public class Questao10 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o valor para a receber as quantidade de bilhete,|1=> unitário|2 => duplo|3 => 10 viagens| ");
    int QuantB= sc.nextInt();
    
    System.out.println("Digite o valor colocado na maquina");
    int valorV= sc.nextInt();
    
    
 
    
  float Calculo1, Calculo2 ,Calculo3;
	 {
	    	
	    	Calculo1 = valorV / 2;
	    	Calculo2 = valorV / 3;
	    	Calculo3 = valorV / 12;	
	    	
	    }
    
    sc.close();
    
    switch (QuantB){
			    
			    case 1 : 
			    		if (Calculo1 > 1 ) {
			    			System.out.println(" voce consegue comprar: ");
			    		} else if ( Calculo1 < 1) {
			    			System.out.println("Saldo insuficiente ");
			    		}
			    break;
			    		
			    case 2: 		
			    	if (Calculo2 > 1 ) {
						System.out.println(" voce consegue comprar: ");
					} else if ( Calculo2 < 1) {
						System.out.println("Saldo insuficiente ");
						}
			    	break;
			    	
			    case 3: 
			    	if (Calculo3 > 1 ) {
						System.out.println(" voce consegue comprar: ");
					} else {
						if ( Calculo3 < 2 ) {
							System.out.println("Saldo insuficiente ");
						}
					}
						
			    break;
			    	
			    }
            }
    }