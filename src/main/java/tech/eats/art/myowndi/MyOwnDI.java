package tech.eats.art.myowndi;

import java.lang.reflect.Field;

/**
 * Created by John on 9/26/16.
 */
public class MyOwnDI {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> clazz = Class.forName("tech.eats.art.myowndi.Facade");
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields){
            TimeOfDay myInject = field.getAnnotation(TimeOfDay.class);

            if(myInject != null){
                System.out.printf("Field %s is annotated with %s", field, myInject);
                Object facade = clazz.newInstance();
                Class<?> serviceType = field.getType();
                Object service = serviceType.newInstance();
                field.setAccessible(true);
                field.set(facade, service);
                System.out.println("\n-----------------");
                System.out.println("Facade: " + facade);
            }else{
                System.out.printf("Field %s is not annotated", field);
            }
        }
    }
}
