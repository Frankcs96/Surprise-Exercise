

import java.util.Scanner;

public class SurpriseExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height;
    String character; 
    int heightIncrement;
    int numberOfHourglass;
    
    do {
      System.out.println("Introduzca la altura inicial: ");
      height = sc.nextInt();
      sc.nextLine();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("no es valido, debe ser impar y mayor o igual que 3");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    System.out.println("Introduzca el caracter para pintar");
    character = sc.nextLine();
    
    do {
      System.out.println("Introduzca el incremento de la altura");
      heightIncrement = sc.nextInt();
      
      if (heightIncrement % 2 != 0) {
        System.out.println("Debe ser par");
      }
    } while (heightIncrement % 2 != 0);
    
    
    System.out.println("Introduzca el numero de veces que desea dibujar el reloj");
    numberOfHourglass = sc.nextInt();
    
    for (int y = 0; y < numberOfHourglass; y++) {
    
     for (int i = 0; i < height / 2 + 1; i++) {
       
       
       for (int k = 0; k < i; k++) {
         System.out.print(" ");
         
       }
       
       for (int j = 1; j <= height - 2 * i; j++) {
         System.out.print(character);
         
         
       }
       
       System.out.println();
       
     }
     
     for (int i = 0; i < height / 2; i++) {
       
       
       for (int k = height / 2 - 1; k > i; k--) {
         System.out.print(" ");
         
       }
       
       for (int j = 0; j <= 2 + i * 2; j++) {    
         System.out.print(character);
         
         
       }
       
       System.out.println();
       
     }
     
     System.out.println();
     height += heightIncrement;
    
    }
    
   
    
  }
}
