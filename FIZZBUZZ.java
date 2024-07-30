
/**
 Josue Jonathan Perez Valenzuela
 Problema 4 (Fizz - Buzz):
 Se desea imprimir los numeros del 1 al 100, teniendo en cuenta que:
 si el numero a imprimir es multiplo de 3 se debe imprimir "Fizz"
 si el numero a imprimir es multiplo de 5 se debe imprimir "Buzz" 
 y en caso de que sea multiplo tanto de 3 y 5 se debe imprimir "FizzBuzz"
 */
public class FIZZBUZZ{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}