package Modulo_10;

import java.util.Scanner;

/*
 * @author tarcio.teles 
 */

	public class if_and_else_elif {

	    public static void main(String args[]) {
	        
	    	int idade = -1;
	        
	    	if (idade > 18) {
	            System.out.println("Pode entrar");
	        } else if (idade == 18) {
	            System.out.println("Parabéns");
	        } else if (idade < 1) {
	            System.out.println("Não Existe");
	        }else {
	            System.out.println("Entrada Proibida");
	        }
	    	
	    	Scanner s = new Scanner(System.in);
            System.out.println("Digite a idade do acompanhante:");
            int idade2 = s.nextInt();
            
        	if (idade2 >= 18) {
	            System.out.println("Pode entrar");
	        }else if (idade2 < 1) {
	            System.out.println("Não Existe");
	        }else {
	            System.out.println("Entrada Proibida");
	        }

	    	
	    }
	}
