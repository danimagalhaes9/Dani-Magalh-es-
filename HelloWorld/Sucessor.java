import java.util.Scanner;
public class Sucessor{
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);
       System.out.print ("digite o primeiro numero: ");
       int primeiroNumero = scanner.nextInt();
       System.out.print("digite o segundo numero: ");
       int segundoNumero = scanner.nextInt();
       System.out.print("digite o terceiro numero: ");
       int terceiroNumero = scanner.nextInt();
       int soma = primeiroNumero + segundoNumero;
       System.out.print("digite o terceiro numero: ");
         int soma = primeiroNumero + segundoNumero; 
       int quartoNumero = scanner.nextInt();
       int subtracao = terceiroNumero - quartoNumero;
      
       System.out.println("soma = " + soma);
       System.out.println("subtracao = " + subtracao);


    }

}
