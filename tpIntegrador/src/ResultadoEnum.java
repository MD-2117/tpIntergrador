public class ResultadoEnum {
    int ganador,perdedor,empate=0;
    ResultadoEnum(int ganadorP,int perdedorP,int empateP){
        this.ganador=ganadorP;
        this.perdedor=perdedorP;
        this.empate=empateP;
    }
    public int getGanador(){
        return this.ganador;
    }
    public int getPerdedor(){
        return this.perdedor;
    }
    public int getEmpate(){
        return this.empate;
    }
}
