package restaurantes;

//Atributos 
public class Restaurante {
    private String nombre;
    private String localizacion;
    private String horario;
    private String puntuacion;

    //Getters y Setters 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    // Constructor 
    public Restaurante(String nombre, String localizacion, String horario, String puntuacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.horario = horario;
        this.puntuacion = puntuacion;
    }
}
