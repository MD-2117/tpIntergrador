public class ResultadoEnum {
    String[] resultado=new String[2];
    ResultadoEnum(String equipoX,String resultadoX){
        this.resultado[0]=equipoX;
        this.resultado[1]=resultadoX;
    }

    public ResultadoEnum(String[] resultadoR) {
        this.resultado[0]=resultadoR[0];
        this.resultado[1]=resultadoR[1];
    }

    public String getResultado() {
        return this.resultado[0];
    }
}
