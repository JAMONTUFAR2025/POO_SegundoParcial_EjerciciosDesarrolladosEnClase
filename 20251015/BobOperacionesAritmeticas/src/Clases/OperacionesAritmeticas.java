package Clases;

public class OperacionesAritmeticas
{
    // Atributos
    double numero1;
    double numero2;

    // Constructor
    public OperacionesAritmeticas(double numero1, double numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos publicos
    // Mostrar resultados, se llamara en main
    public void mostrarResultados()
    {
        sumar();
        restar();
        multiplicar();
        dividir();
        potencia();
    }

    // Métodos privados
    // Sumar
    private void sumar()
    {
        System.out.println("Suma: " + (numero1 + numero2));
    }

    // Restar
    private void restar()
    {
        System.out.println("Resta: " + (numero1 - numero2));
    }

    // Multiplicar
    private void multiplicar()
    {
        System.out.println("Multiplicacion: " + (numero1 * numero2));
    }

    // Dividir, verificar si numero 2 es 0
    private void dividir()
    {
        if (numero2 != 0)
            System.out.println("Division: " + (numero1 / numero2));
        else
            System.out.println("Division: Error, no se puede dividir entre 0");
    }

    // Potencia
    private void potencia()
    {
        System.out.println("Potencia: " + Math.pow(numero1, numero2));
    }
}
