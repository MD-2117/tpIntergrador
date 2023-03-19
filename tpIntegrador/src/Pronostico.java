import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Pronostico{

    int gol1=0;
    int gol2=0;
    String pronostico="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\pronostico.txt";
    String[] pronosticoA = leerArchivo(pronostico);
    public Pronostico() throws FileNotFoundException {
        try{
            int number = Integer.parseInt(pronosticoA[1]);
            gol1=number;
            number=Integer.parseInt(pronosticoA[3]);
            gol2=number;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
    Partido pronostico1 = new Partido(pronosticoA[0],pronosticoA[2],gol1,gol2);

    public static String[] leerArchivo(String ruta) throws FileNotFoundException {
        File archivo = new File(ruta);
        Scanner scanner = new Scanner(archivo);
        String contenido = scanner.nextLine();
        String[] array = contenido.split(",");
        scanner.close();
        return array;
    }
}
