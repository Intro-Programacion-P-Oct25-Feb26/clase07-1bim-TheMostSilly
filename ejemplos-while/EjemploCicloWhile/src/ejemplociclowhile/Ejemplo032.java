
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;


public class Ejemplo032 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        
        
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextInt();
            if (valor_ingresado >= 20 && valor_ingresado <= 35){
                suma = suma + valor_ingresado;
            }else{
                suma = suma + 50;
            }
            suma = suma + valor_ingresado;
            System.out.printf("Valor ingresado %d\n", 
                    valor_ingresado);
            contador = contador + 1;
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}

