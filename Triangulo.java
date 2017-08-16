
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    // instance variables - replace the example below with your own
    double lado1=0;
    double lado2=0;
    double lado3=0;
    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo(double l1, double l2, double l3)
    {
        // initialise instance variables
        lado1=l1;
        lado2=l2;
        lado3=l3;
    }
     
    public void darLado1()
    {
        System.out.println("el valor del lado 1 es: " + lado1);
    }
    public void darLado2()
    {
        System.out.println("el valor del lado 1 es: " + lado2);
    }
    public void darLado3()
    {
        System.out.println("el valor del lado 1 es: " + lado3);
    }    
    public void darPerimetro()
    {
        double perimetro= lado1+lado2+lado3;
        System.out.println("el valor del perimetro del triangulo es: " + perimetro);
    }  
    public void darArea() //Se utiliza la formula de Heron
    {
        double S= ((lado1+lado2+lado3)/2);
        double Area = Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
        System.out.println("el valor del area del triangulo es: " + Area);
    }      
}
