public class Equipo {
    String nombre;
    String descripcion;
    Equipo(String nombreEquipo,String descripcionEquipo){
        this.nombre=nombreEquipo;
        this.descripcion=descripcionEquipo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
}
