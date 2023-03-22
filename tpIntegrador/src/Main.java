import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //creamos los goles de forma aleatoria
        int golEquipo1 = (int)(Math.random()*10+0);
        int golEquipo2 = (int)(Math.random()*10+0);
        int golPronostico1=0;
        int golPronostico2=0;
        //leemos los archivos y cargamos en arreglos
        String ronda="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\ronda.txt";
        String[] rondaA= leerArchivo(ronda);
        String pronostico="C:\\Users\\danie\\OneDrive\\Escritorio\\Argentina Programa\\Repositorio\\tpIntergrador\\pronostico.txt";
        String[] pronosticoArray = leerArchivo(pronostico);
        //creamos las clases del pronostico
        Partido partidoJUAN = new Partido(pronosticoArray[0],pronosticoArray[2],convertToInt(pronosticoArray[1]),convertToInt(pronosticoArray[3]));
        Equipo equipoJUAN = new Equipo(pronosticoArray[0],"la mejor seleccion");
        Pronostico pronosticoJUAN = new Pronostico(partidoJUAN,equipoJUAN);
        //creamos las clases del partido con los arreglos
        Equipo equipo1 = new Equipo(rondaA[0],"la mejor seleccion");
        Equipo equipo2 = new Equipo(rondaA[2],"los que vienen de la selva");
        Partido primerPartido = new Partido(equipo1.getNombre(),equipo2.getNombre(),golEquipo1,golEquipo2);
        //cargo resultadoEnum
        String[] cargoResultado = new String[2];
        cargoResultado = primerPartido.resultado(primerPartido.getPrimerEquipo(),primerPartido.getSegundoEquipo(),primerPartido.getGolesEquipo1(),primerPartido.getGolesEquipo2()).split(",");
        ResultadoEnum resultadoFinal = new ResultadoEnum(cargoResultado);
        cargoResultado = partidoJUAN.resultado(partidoJUAN.getPrimerEquipo(),partidoJUAN.getSegundoEquipo(),partidoJUAN.getGolesEquipo1(),partidoJUAN.getGolesEquipo2()).split(",");
        ResultadoEnum resultadoProno= new ResultadoEnum(cargoResultado);
        //imprimo puntos
        if(resultadoFinal.getResultado().equals(resultadoProno.getResultado())){
            pronosticoJUAN.setPuntos(1);
        }
        System.out.println(pronosticoJUAN.getPuntos());
    }
    public static String[] leerArchivo(String ruta) throws FileNotFoundException {
        File archivo = new File(ruta);
        Scanner scanner = new Scanner(archivo);
        String contenido = scanner.nextLine();
        String[] array = contenido.split(",");
        scanner.close();
        return array;
    }
    public static int convertToInt(String numeroS) {
        int number = 0;
        try {
            number = Integer.parseInt(numeroS);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return number;
    }
}