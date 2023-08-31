//Realizar un ejercicio en java que almacene e imprima nombre de un alumno(a),
// edad y 4 calificaciones de asignaturas, las 4 calificaciones se deben almacenar en unarreglo.

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productos = "" ;
        double costo = 0;
        producto pr[] = new producto[4];

        for( int i = 0; i< pr.length; i++){
            System.out.println("DESCRIPCION DEL PRODUCTO");
            productos = scanner.nextLine();
            System.out.println( "PRECIO DEL PRODUCTO");
            costo = scanner.nextDouble();
            scanner.nextLine();
            pr[i] = new producto( productos, costo);
        }
        for( int i = 0; i< pr.length; i++){
            System.out.println(pr[i].getDescripcion() + " " + pr[i].getPrecio() );
        }



    }
}