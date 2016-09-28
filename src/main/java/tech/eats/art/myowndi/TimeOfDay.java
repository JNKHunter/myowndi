package tech.eats.art.myowndi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by John on 9/26/16.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeOfDay {

    DayTime value();

    enum DayTime{

        MORNING, EVENING

    }

}
