package modulos;

import java.util.Random;
import java.util.Scanner;

public class ExamenED {

    static int w = 30;

    public static void main(String args[]){

        System.out.println("INTRODUCE UN NUMERO PARA DAR TAMAÑO AL ARRAY: ");
        Scanner input = new Scanner(System.in);
        int tamañoArray = input.nextInt();
        Random random = new Random();
        int []numerosAleatorios = new int[tamañoArray];
        for(int posicionArray=0; posicionArray<tamañoArray; posicionArray++)
        {
            numerosAleatorios[posicionArray] = random.nextInt(ExamenED.w);//Rellena los espacios del array con numeros aleatorios
        }

        ExamenED.esPar(numerosAleatorios);
        input.close();
    }


    public static void esPar(int[] numerosAleatorios){

        int max = 0;
        int min = ExamenED.w;

        for(int in=0; in<numerosAleatorios.length; in++)
        {
            System.out.println(numerosAleatorios[in]);
            if(numerosAleatorios[in] > max ){
                max = numerosAleatorios[in];
            }

            if(numerosAleatorios[in] < min){
                min = numerosAleatorios[in];
            }
        }

        int z = min *max;
        if (z == 0 || (z % 2 != 0)  ){
            System.out.println("NO ES PAR");
        }else{
            System.out.println("ES PAR");
        }

    }
}
