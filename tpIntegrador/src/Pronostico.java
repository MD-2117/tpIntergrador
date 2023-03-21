import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Pronostico{
    int puntos=0;
    Partido partido = new Partido("equipo1","equipo2",0,1);
    Equipo equipo = new Equipo("argentina","la mejor");

    Pronostico(Partido partidoPro,Equipo equipoPro){
        this.equipo=equipoPro;
        this.partido=partidoPro;
        this.puntos=0;
    }

    public Equipo getEquipo() {
        return this.equipo;
    }
    public Partido getPartido() {
        return this.partido;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPuntos(int puntosPartido){
        this.puntos=puntosPartido;
    }

}
