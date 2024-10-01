import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TareasDato.class)

public @interface TareaDato {
    String tituloTarea() default "";
    String descripcionTarea() default "";
    String diaSemana() default "";
    String hora() default "";
}
