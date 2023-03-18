import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");
        int goles = (int)(Math.random()*10+0);
        String pronostico="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\pronostico.txt";
        String ronda="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\ronda.txt";
        String[] pronosticoA = leerArchivo(pronostico);
        String[] rondaA= leerArchivo(ronda);
        for (int i=0;i<pronosticoA.length;i++) {
            System.out.println(pronosticoA[i]);
        }
        for (int i = 0; i < rondaA.length; i++) {
            System.out.println(rondaA[i]);
        }
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