import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");
        int golEquipo1 = (int)(Math.random()*10+0);
        int golEquipo2 = (int)(Math.random()*10+0);
        int golPronostico1;
        int golPronostico2;
        String ronda="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\ronda.txt";
        String[] rondaA= leerArchivo(ronda);
        String pronostico="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\pronostico.txt";
        String[] pronosticoA = leerArchivo(pronostico);
        try{
            int number = Integer.parseInt(pronosticoA[1]);
            golPronostico1=number;
            number=Integer.parseInt(pronosticoA[3]);
            golPronostico1=number;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
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