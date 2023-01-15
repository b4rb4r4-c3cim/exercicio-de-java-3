//um programa que peça uma nota de zero a dez, mostre uma mensagem caso o valor seja invalido e continue
//ate que o usuario informe um valor valido

import java.util.Scanner;
public class exer1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

            do{ 
                System.out.println("Informe uma nota: ");
                    double nota = scan.nextDouble();
                    notaValida = true; 

                    if(nota >= 0 && nota <= 10){
                    System.out.println("Voce digitou: " + nota);
                } else{
                    //notaValida == false
                    System.out.println("Nota invalida, digite novamente!");
                } 
            } while(!notaValida);
            
    
}
}