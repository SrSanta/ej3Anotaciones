import java.util.ArrayList;
import java.util.List;


@TareaDato(
        tituloTarea = "saludos",
        descripcionTarea = "illo",
        diaSemana = "martes",
        hora = "15:00"
)

@TareaDato(
        tituloTarea = "despido",
        descripcionTarea = "tio",
        diaSemana = "miercole",
        hora = "14:00"
)

@TareaDato(
        tituloTarea = "gracias",
        descripcionTarea = "bro",
        diaSemana = "jueves",
        hora = "19:00"
)


public class AgendaSemana {
    private List<Tarea> tareaList;

    public void cargadorDeTareas() {
        TareaDato[] tareaDato = AgendaSemana.class.getAnnotationsByType(TareaDato.class);

        for (TareaDato tareaDato1 : tareaDato) {
            Tarea tarea;
            tarea = new Tarea(tareaDato1.tituloTarea(), tareaDato1.descripcionTarea(), tareaDato1.diaSemana(), tareaDato1.hora());
            tareaList.add(tarea);
        }
    }

    public AgendaSemana(){
        tareaList = new ArrayList<>();
        cargadorDeTareas();
    }

    @Override
    public String toString() {
        return "AgendaSemana{" +
                "tareas=" + tareaList +
                '}' + tareaList.size();
    }
}
