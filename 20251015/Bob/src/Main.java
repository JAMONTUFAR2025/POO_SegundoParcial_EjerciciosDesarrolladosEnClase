import Clases.Persona;

public class Main
{
    public static void main(String[] args)
    {
        // Crear un objeto de la clase Persona usando el constructor
        Persona persona = new Persona("Alejandro", 19, "Baleadas");

        // ctrl + alt + shift + J = seleccionar todas las ocurrencias de una palabra
        // Llamar al metodo para mostrar la informacion
        persona.mostrarInfo();
    }
}
