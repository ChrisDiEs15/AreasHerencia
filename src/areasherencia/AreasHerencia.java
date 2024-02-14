/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areasherencia;
import java.util.Scanner;


/**
 *
 * @author Chris
 */
public class AreasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner medidas = new Scanner (System.in);
        System.out.println("Programa para calcular Area y perimetro de dos figuras");
        System.out.println("Elija el numero de figura que desea calcular");
        System.out.println("1.Triangulo");
        System.out.println("2.Rectangulo");
        int entrada1 = entrada.nextInt();
        switch (entrada1) {
            case 1 -> {
                System.out.println("Ingrese el tamano de la base");
                float base = medidas.nextFloat();
                System.out.println("Ingrese la altura");
                float altura = medidas.nextFloat();
                /*Create new triangulo*/
                Triangulo trianguloLocal = new Triangulo(0, 0, 0, 0, "triangulo");
                /*set altura*/
                trianguloLocal.setAltura(altura);
                /*set base*/
                trianguloLocal.setBase(base);
                /*ToDo, realize verification if area or base not found before adquire Area and Perimetro*/
                /*Adquire area*/
                trianguloLocal.CalcArea();
                /*Adquire perimetro*/
                trianguloLocal.CalcPerimetro();
            }
            case 2 -> {
                System.out.println("Ingrese el tamano de la base");
                float base2 = medidas.nextFloat();
                System.out.println("Ingrese la altura");
                float altura2 = medidas.nextFloat();
                /*Creates a new rectangulo */
                Rectangulo rectanguloLocal = new Rectangulo(0, 0, 0, 0, "rectangulo" );
                /*set base*/
                rectanguloLocal.setBase(base2);
                /*set altura*/
                rectanguloLocal.setAltura(altura2);
                /*Adquire area*/
                rectanguloLocal.CalcArea();
                /*Adquire Perimetro*/
                rectanguloLocal.CalcPerimetro();
            }
            default -> System.out.println("Opcion invalida");
        }
    }
    
}
