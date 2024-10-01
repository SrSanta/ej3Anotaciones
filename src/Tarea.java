import java.lang.annotation.Annotation;

public class Tarea{
    private String tituloTarea;
    private String descripcionTarea;
    private String diaSemana;
    private String hora;


    public Tarea(String tituloTarea, String descripcionTarea, String diaSemana, String hora) {
        this.tituloTarea = tituloTarea;
        this.descripcionTarea = descripcionTarea;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "tituloTarea='" + tituloTarea + '\'' +
                ", descripcionTarea='" + descripcionTarea + '\'' +
                ", diaSemana='" + diaSemana + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
