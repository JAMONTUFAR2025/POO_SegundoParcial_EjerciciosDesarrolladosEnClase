import Clases.CicloFor;
import Clases.CicloMientras;
import Clases.Recursividad;

public class Main
{
    public static void main(String[] args)
    {
        // Ejemplo de uso de la clase Recursividad
        System.out.println("RECURSIVIDAD: ");
        Recursividad r = new Recursividad();
        r.cuentaRegresiva(10);

        // Ejemplo de uso de la clase CicloFor
//        System.out.println("\nCICLO FOR: ");
//        CicloFor cf = new CicloFor(0, 10, 1);
//        cf.forHechizo();

        System.out.println("\nCICLO FOR: ");
        CicloFor cf = new CicloFor(0, 100, 3);
        cf.forHechizo();

        // Ejemplo de uso de la clase CicloMientras
        System.out.println("\nCICLO WHILE: ");
        CicloMientras cm = new CicloMientras(10);
        cm.whileHechizo();
    }
}
