import java.util.Scanner;
import java.util.Random;
/**
 * Josue Jonathan Perez Valenzuela
 * Problema 5 (Juego de adivinanza):
 * Juego de adivinanza de numeros, programa que genere un numero aleatorio entre 1 y 100, 
 * el usuario debe adivinar el numero generado mediante teclado, asi mismo el programa debe 
 * dar pistas como "Bajo", "Alto" y "Adivinado" e imprimir el numero de intentos.
 */
public class Adivinanza{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Genera un numero aleatorio entre 0 (inclusive) y 100 (Exclusivo)
        int numeroSecreto = random.nextInt(100);
        numeroSecreto = numeroSecreto + 1;
        System.out.println("Bienvenido al juego de adivinar un numero");
        System.out.println("He generado un numero entre 1 y 100, intenta adivinarlo");
        int numeroUsuario = 0;
        int intentos = 0;
        while(numeroUsuario != numeroSecreto){
            //Proceso para pedir numero por consola
            System.out.println("Introduce tu numero: ");
            numeroUsuario = scanner.nextInt();
            intentos++;
            
            if(numeroUsuario < numeroSecreto){
                System.out.println("Bajo");
            }else if(numeroUsuario > numeroSecreto){
                System.out.println("Alto");
            }else{
                System.out.println("Adivinado, te tardo " + intentos + " intentos");
            }
        }
        //Fin
    }
}
