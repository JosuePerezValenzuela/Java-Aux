import java.util.Scanner;
/**
 Josue Jonathan Perez Valenzuela
 Problema 3 (Numeros amigos):
 Dado 2 numeros determinar si estos son amigos, 2 numeros son amigos se da
 cuando la suma de los divisores propios de A (excluyendolo a el mismo)
 es igual a B y la suma de los divisores de B (excluyendolo a el mismo)
 es igual a A.
 Ejemplo
 220 y 284
 Divisores de 220 -> 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
 Divisores de 284 -> 1, 2, 4, 71, 142
 */
public class numerosAmigos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        
        int sumaDivisoresNum1 = sumaDivisoresPropios(numero1);
        
        int sumaDivisoresNum2 = sumaDivisoresPropios(numero2);
        
        if(sumaDivisoresNum1 == numero2 && sumaDivisoresNum2 == numero1){
            System.out.println(numero1 + " y " + numero2 + " son numeros amigos");
        }else{
            System.out.println(numero1 + " y " + numero2 + " no son numeros amigos");
        }
    }
    
    public static int sumaDivisoresPropios(int numero){
        int suma = 0;
        for(int i = 1; i <= numero / 2; i++){
            if(numero % i == 0){
                suma = suma + i;
            }
        }
        return suma;
    }
}