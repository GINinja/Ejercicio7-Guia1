import java.util.Scanner;
/**
 * Write a description of class ViajeSasaima here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ViajeSasaima
{
public static void main (String[] args) 
   {
   Scanner input = new Scanner(System.in);
   
   System.out.println("Ingrese el peso en kilogramos de la carga a transportar");
   double carga = input.nextDouble();
   
   System.out.println("Ingrese la eficiencia del camion en kilometros por galon");
   
   double eficiencia = input.nextDouble();
   
   System.out.println("Ingrese la capacidad de carga del camion");
   
   double capacidad = input.nextDouble();
   
   // distancia Bogota - Sasaima
   int distancia = 78;
   // Precio de combustible
   double gas = 10000;
   
   
   // Numero de viajes necesarios
   
   double viajes = carga / capacidad;
   System.out.println("La cantidad de viajes requeridos son:" + viajes);
   
   // cantidad de combustible
   
   double gastoGas = (distancia / eficiencia) * viajes;
   System.out.println("La cantidad en galones de combustible necesaria es:" + gastoGas);
   
   // Costo total de combustible
   
   double costoGas = gastoGas * gas;
   System.out.println("El costo del combustible es:" + costoGas);
   
}
}