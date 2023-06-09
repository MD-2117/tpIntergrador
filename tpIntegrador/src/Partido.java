public class Partido {
    int golesEquipo1;
    int golesEquipo2;
    String primerEquipo;
    String segundoEquipo;
    Partido(String equipo1,String equipo2, int goles1, int goles2){
        this.primerEquipo=equipo1;
        this.segundoEquipo=equipo2;
        this.golesEquipo1=goles1;
        this.golesEquipo2=goles2;
    }

    public String getPrimerEquipo() {
        return this.primerEquipo;
    }
    public String getSegundoEquipo(){
        return this.segundoEquipo;
    }
    public int getGolesEquipo1(){
        return this.golesEquipo1;
    }

    public int getGolesEquipo2() {
        return this.golesEquipo2;
    }

    public String resultado(String primerEquipo, String segundoEquipo, int golesEquipo1, int golesEquipo2){
        String resultadoFinal = null;
        if (golesEquipo1 > golesEquipo2) {
            resultadoFinal=primerEquipo;
            resultadoFinal= resultadoFinal+",ganador";
        } else if (golesEquipo1<golesEquipo2) {
            resultadoFinal=primerEquipo;
            resultadoFinal= resultadoFinal+",ganador";
        } else if (golesEquipo1==golesEquipo2){
            resultadoFinal="ambos equipos";
            resultadoFinal=resultadoFinal+",empate";
        }
        return resultadoFinal;
    }
}