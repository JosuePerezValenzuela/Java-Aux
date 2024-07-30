import java.util.Scanner;
/**
 Josue Jonathan Perez Valenzuela
 Problema 2 (Determinar el tipo de triangulo):
 Dado los 3 lados de un triangulo se debe determinar si este es valido
 en caso de que lo sea tambien se debe determinar el tipo de triangulo
 
 Para que un triangulo sea considerado valido la suma de 2 lados
 siempre debe ser mayor al otro lado
 Equilatero -> Todos los lados son iguales
 Isosceles -> Dos lados son iguales
 Escaleno -> Ningun lado es igual a otro
 */
public class triangulo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio de los triangulos");
        System.out.println("Ingrese el primer lado del triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        double lado3 = scanner.nextDouble();
        String resp = "Este triangulo es ";
        
        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println(resp + "Equilatero");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println(resp + "Isosceles");
            }else{
                System.out.println(resp + "Escaleno");
            }
        }else{
            System.out.println("Este triangulo no es valido");
        }
    }
}
