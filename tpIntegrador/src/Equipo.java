public class Equipo {
    String nombre;
    String descripcion;
    Equipo(String nombreEquipo,String descripcionEquipo){
        this.nombre="equipoFalso";
        this.descripcion="123";
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
}
