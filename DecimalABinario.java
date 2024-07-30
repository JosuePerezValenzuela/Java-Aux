import java.util.Scanner;
/**
 * Josue Jonathan Perez Valenzuela
 * Problema 6 (De decimal a binario):
 * Dado un numero del sistema decimal leido por teclado, se debe imprimir su
 * equivalente en el sistema binario
 * Ejemplo:
 * Numero 10 en decimal para convertirlo se debe hacer el siguiente proceso:
 * 10 % 2 = 0 -> binario = "0"
 * 10 / 2 = 5
 * 5 % 2 = 1 -> binario = "10"
 * 5 / 2 = 2
 * 2 % 2 = 0 -> binario = "010"
 * 2 / 2 = 1
 * 1 % 2 = 1 -> binario = "1010"
 * 1 / 2 = 0
 */
public class DecimalABinario{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeroDecimal = scanner.nextInt();
        int numero = numeroDecimal;
        String binario = "";
        
        if(numero == 0){
            binario = "0";
        }else{
            while(numero > 0){
                int residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }
        }
        
        System.out.println("El numero decimal: " + numeroDecimal + " en binario es: " + binario);

    }
}
