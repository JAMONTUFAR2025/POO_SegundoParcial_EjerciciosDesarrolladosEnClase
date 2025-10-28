package Clases;

public class Persona
{
    // Atributos o propiedades
    String nombre;
    int edad;
    String comida;

    // Constructor: Inicializa los atributos al crear un objeto
    // Un constructor es un metodo especial para crear e inicializar objetos
    // -- El constructor tiene el mismo nombre que la clase
    // -- No tiene tipo de retorno (ni void ni otro)
    // -- Se ejecuta una sola vez: justo cuando se crea el objeto
    public Persona(String nombre, int edad, String comida)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
    }

    // Cuando usar un constructor?
    // -- Cuando queremos que un objeto tenga ciertos valores iniciales
    // -- Cuando queremos obligar a quien crea el objeto a proporcionar ciertos datos
    // -- Cuando queremos evitar que un objeto se cree sin ciertos datos

    // Cuando no usar un constructor?
    // -- Cuando los atributos pueden tener valores por defecto (0, null, false)
    // -- Cuando los atributos pueden ser modificados despues de crear el objeto
    // -- Tampoco se recomienda crear constructores con muchos parametros (mas de 4 o 5)

    // Metodo para mostrar la informacion de la persona
    public void mostrarInfo()
    {
        System.out.println("Nombre: " + nombre + ".");
        System.out.println("Edad: " + edad + " anios.");
        alimentacion();
    }

    // Metodo para mostrar la comida favorita
    public void alimentacion()
    {
        System.out.println("Le gusta comer: " + comida + ".");
    }
}
