import java.util.Scanner;
/**
Josue Jonathan Perez Valenzuela
Problema 1 (IMC):
Calcular el IMC (indice de masa corporal dado el peso en kg y la
altura en metros de una persona
IMC = Peso / (Altura * Altura)
Si IMC < 18.5 "Bajo peso"
Si IMC < 24.9 "Peso normal"
Si IMC < 29.9 "Sobre peso"
Otro caso "Obesidad"
 */
public class IMC{
    public static void main(String[] args){
        int numeroEntero = 100;
        double numeroDecimal = 3.1416;
        boolean verdadero = true;
        boolean falso = false;
        char caracter = 'A';
        String palabra = "Hola mundo";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(numeroEntero);
        System.out.println(numeroDecimal);
        System.out.println(verdadero);
        System.out.println(falso);
        System.out.println(caracter);
        System.out.println(palabra);
        System.out.println("Ejercicio IMC");
        System.out.println("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        //Calculo de IMC
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es " + imc);
        String categoria;
        if(imc < 18.5){
            categoria = "Bajo peso";
        }else if(imc < 24.9){
            categoria = "Peso normal";
        }else if(imc < 29.9){
            categoria = "Sobrepeso";
        }else{
            categoria = "Obesidad";
        }
        System.out.println("Categoria del IMC correspondiente a: " + categoria);
    }
}
