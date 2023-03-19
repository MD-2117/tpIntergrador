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
    public String[] resultado(String primerEquipo,String segundoEquipo,int golesEquipo1,int golesEquipo2){
        String[] resultadoFinal = new String[2];
        if (golesEquipo1 > golesEquipo2) {
            resultadoFinal[0]=primerEquipo;
            resultadoFinal[1]="ganador";
        }
        return resultadoFinal;
    }
}