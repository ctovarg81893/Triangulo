import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        double l1=0;
        double l2=0;
        double l3=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Introduzca el lado 1");
        System.out.println(" ");        
        l1 = lectura.nextInt();
//        System.out.println(" ");
        System.out.print("Introduzca el lado 2");
        System.out.println(" ");        
        l2 = lectura.nextInt();
        System.out.print("Introduzca el lado 3");
        System.out.println(" ");        
        l3 = lectura.nextInt();
        Triangulo triangulo = new Triangulo(l1,l2,l3);
        triangulo.darLado1();
        triangulo.darLado2();
        triangulo.darLado3();
        triangulo.darArea();
        triangulo.darPerimetro();

    }
}