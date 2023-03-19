import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");
        int goles1 = (int)(Math.random()*10+0);
        int goles2 = (int)(Math.random()*10+0);
        String ronda="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\ronda.txt";
        String[] rondaA= leerArchivo(ronda);

        Equipo equipo1 = new Equipo(rondaA[1],rondaA[2]);
        Equipo equipo2 = new Equipo(rondaA[3],rondaA[4]);
        Partido primerPartido = new Partido(equipo1.nombre,equipo2.nombre,goles1,goles2);

    }
    public static String[] leerArchivo(String ruta) throws FileNotFoundException {
        File archivo = new File(ruta);
        Scanner scanner = new Scanner(archivo);
        String contenido = scanner.nextLine();
        String[] array = contenido.split(",");
        scanner.close();
        return array;
    }
}