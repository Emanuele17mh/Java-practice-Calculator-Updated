import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // Creazione dello scanner
    Scanner scanner = new Scanner(System.in);
    
    //Scelta dei numeri da inserire

    System.out.println("Inserisci il primo numero");
    int num1 = scanner.nextInt();
    System.out.println("Inserisci il secondo numero");
    int num2 = scanner.nextInt();
    
    //Scelta dell'operazione da svolgere
    System.out.println("Inserisci il numero corrispettivo per eseguire l'operazione:");
    System.out.println("1. Moltiplicazione");
    System.out.println("2. Divisione");
    System.out.println("3. Addizione");
    System.out.println("4. Sottrazione");
    System.out.println("5. Rimanenza");
    int operazione = scanner.nextInt();

    //Logica calcolatrice
	switch(operazione){
      case 1:
       System.out.println("Risultato della moltiplicazione: " + (num1 * num2));
      break;
      
      case 2:
      System.out.println("Risultato della divisione: " + (num1 / num2));
      break;
      
      case 3:
      System.out.println("Risultato dell'addizione: " + (num1 + num2));
      break;
      
      case 4:
      System.out.println("Risultato della sottrazione: " + (num1 - num2));
      break;
      
      case 5:
      System.out.println("Risultato della rimanenza: " + (num1 % num2));
      break;

    default:
      System.out.println("Operazione non valida");
      break;
    }
     
    
  }
  


}