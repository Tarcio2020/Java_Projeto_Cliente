package Modulo_10;
import java.util.Scanner;

public class SwichtCase {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite a idade: ");
	        int idade = scanner.nextInt();

	        switch (idade) {
	            case 0:
	            case 1:
	            case 2:
	                System.out.println("Bebê");
	                break;
	            case 3:
	            case 4:
	            case 5:
	                System.out.println("Criança");
	                break;
	            case 6:
	            case 7:
	            case 8:
	            case 9:
	                System.out.println("Pré-adolescente");
	                break;
	            case 10:
	            case 11:
	            case 12:
	                System.out.println("Adolescente");
	                break;
	            default:
	                System.out.println("Adulto");
	                break;
	        }

	        scanner.close();
	    }
	}


